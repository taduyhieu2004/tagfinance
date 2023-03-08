package com.example.tagfinance.data.dto;

import com.example.tagfinance.data.entity.TagFinance;

public class TagFinanceDTO {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TagFinanceDTO(TagFinance tagFinance) {
        this.id = tagFinance.getId();
        this.name = tagFinance.getName();
    }
}
