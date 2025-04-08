package com.example.Bank_management_system.service;

import com.example.Bank_management_system.entity.Transaction;
import com.example.Bank_management_system.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class BankStatement {
    @Autowired
    private TransactionRepository transactionRepository;
    public List<Transaction> generateStatement(String accountNumber, String startDate, String endDate) {
        LocalDate starts = LocalDate.parse(startDate, DateTimeFormatter.ISO_DATE);
        LocalDate ends = LocalDate.parse(endDate, DateTimeFormatter.ISO_DATE);
        return transactionRepository.findAll().stream()
                .filter(transaction -> transaction.getAccountNumber().equals(accountNumber))
                .filter(transaction -> {
                    LocalDateTime createdAt = transaction.getCreatedAt();
                    return createdAt != null && (createdAt.toLocalDate().isAfter(starts) || createdAt.toLocalDate().isEqual(starts))
                            && (createdAt.toLocalDate().isBefore(ends) || createdAt.toLocalDate().isEqual(ends));
                })
                .collect(Collectors.toList());
    }

}

