package com.MoneyManager.Repository;

import com.MoneyManager.Model.Transaction;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
    List<Transaction> findByCreatedAtBetween(LocalDateTime start, LocalDateTime end);
}