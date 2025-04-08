package com.example.Bank_management_system.service;

import com.example.Bank_management_system.dto.TransactionDto;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
