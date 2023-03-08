package com.example.tagfinance.service;

import com.example.tagfinance.data.dto.TransactionDTO;
import com.example.tagfinance.data.dto.request.TransactionRequestDTO;
import com.example.tagfinance.data.entity.Transaction;

import java.util.List;

public interface TransactionService {
    void insert(TransactionRequestDTO transactionRequestDTO);

    List<TransactionDTO> getAll();

    void update(TransactionRequestDTO transactionRequestDTO, int id);

    void delete(int id);

    List<TransactionDTO> getTransactionByID(int id);

    List<TransactionDTO> getTransactionByName(String key);


}
