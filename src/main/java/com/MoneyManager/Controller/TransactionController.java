package com.MoneyManager.Controller;


import com.MoneyManager.Model.Transaction;
import com.MoneyManager.Service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/transactions")
@CrossOrigin
public class TransactionController {

    @Autowired
    private TransactionService service;

    @PostMapping
    public Transaction addTransaction(@RequestBody Transaction t) {
        return service.addTransaction(t);
    }

    @GetMapping
    public List<Transaction> getAll() {
        return service.getAllTransactions();
    }

    @GetMapping("/filter")
    public List<Transaction> filterByDate(@RequestParam String from, @RequestParam String to) {
        return service.filterByDate(from, to);
    }

    @PutMapping("/{id}")
    public String update(@PathVariable String id, @RequestBody Transaction t) {
        return service.updateTransaction(id, t);
    }

    @GetMapping("/summary")
    public Map<String, Double> summary() {
        return service.getSummary();
    }
}
