package com.MoneyManager.Model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;

    private double amount;
    private String type;
    private String category;
    private String division;
    private String description;

    private LocalDateTime createdAt = LocalDateTime.now();
}