package com.example.tagfinance.data.dto;

import com.example.tagfinance.data.entity.TagFinance;
import com.example.tagfinance.data.entity.Transaction;

import java.util.Date;

public class TransactionDTO {
    private String title;
    private String description;
    private int amount;
    private int tagID;


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTagID() {
        return tagID;
    }

    public void setTagID(int tagID) {
        this.tagID = tagID;
    }

    public TransactionDTO(String title, int tagID) {

        this.title = title;
        this.tagID = tagID;
    }

    public TransactionDTO(Transaction transaction) {

        this.title = transaction.getTitle();
        this.description = transaction.getDescription();
        this.amount = transaction.getAmount();
        this.tagID = transaction.getTagFinance().getId();
    }

}
