package com.MoneyManager.Service;

import com.MoneyManager.Model.Transaction;
import com.MoneyManager.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository repo;


    public Transaction addTransaction(Transaction t) {
        return repo.save(t);
    }


    public List<Transaction> getAllTransactions() {
        return repo.findAll();
    }


    public List<Transaction> filterByDate(String from, String to) {
        return repo.findByCreatedAtBetween(
                LocalDateTime.parse(from),
                LocalDateTime.parse(to)
        );
    }


    public String updateTransaction(String id, Transaction newData) {

        Transaction old = repo.findById(id).orElseThrow();

        long hoursPassed =
                Duration.between(old.getCreatedAt(), LocalDateTime.now()).toHours();


        if (hoursPassed > 12) {
            return "Editing not allowed after 12 hours";
        }

        old.setAmount(newData.getAmount());
        old.setCategory(newData.getCategory());
        old.setDivision(newData.getDivision());
        old.setDescription(newData.getDescription());
        old.setType(newData.getType());

        repo.save(old);
        return "Updated successfully";
    }

    // Summary
    public Map<String, Double> getSummary() {

        List<Transaction> list = repo.findAll();

        double income = 0;
        double expense = 0;

        for (Transaction t : list) {
            if (t.getType().equalsIgnoreCase("income")) {
                income += t.getAmount();
            } else {
                expense += t.getAmount();
            }
        }

        Map<String, Double> map = new HashMap<>();
        map.put("income", income);
        map.put("expense", expense);
        map.put("balance", income - expense);

        return map;
    }
}

