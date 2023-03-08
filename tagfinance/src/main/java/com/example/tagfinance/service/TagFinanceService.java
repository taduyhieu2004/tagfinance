package com.example.tagfinance.service;

import com.example.tagfinance.data.dto.TagFinanceDTO;
import com.example.tagfinance.data.entity.TagFinance;

import java.util.List;

public interface TagFinanceService {

    List<TagFinanceDTO> getAll();

    TagFinance insert(TagFinance tagFinance);

    void update(TagFinance tagFinance, int id);

    void delete(int id);


}
