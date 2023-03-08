package com.example.tagfinance.controller;

import com.example.tagfinance.data.dto.TransactionDTO;
import com.example.tagfinance.data.dto.request.TransactionRequestDTO;
import com.example.tagfinance.data.entity.Transaction;
import com.example.tagfinance.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/transactions")
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping("/get")
    public List<TransactionDTO> getAllTransaction() {
        List<TransactionDTO> list = transactionService.getAll();
        return list;
    }

    @GetMapping("/{tag_id}/get")
    public List<TransactionDTO> getTransactionByTagFinanceID(@PathVariable(name = "tag_id") int id) {
        List<TransactionDTO> list = transactionService.getTransactionByID(id);
        return list;
    }


    @GetMapping("/{get")
    public List<TransactionDTO> getTransactionByTagFinanceName(@RequestParam(name = "name") String key) {
        List<TransactionDTO> list = transactionService.getTransactionByName(key);
        return list;
    }

    @PutMapping("/{ID}/update")
    public void updateTransaction(@RequestBody TransactionRequestDTO transaction, @PathVariable(name = "ID") int id) {
        transactionService.update(transaction, id);
    }

    @PostMapping("/create")
    public TransactionRequestDTO createTransaction(@RequestBody TransactionRequestDTO transaction) {
        transactionService.insert(transaction);
        return transaction;
    }

    @DeleteMapping("/{id}/delete")
    public void deleteTransaction(@PathVariable(name = "id") int id) {

        transactionService.delete(id);
    }


}
