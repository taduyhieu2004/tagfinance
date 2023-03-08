package com.example.tagfinance.service.impl;

import com.example.tagfinance.dao.TagFinanceDAO;
import com.example.tagfinance.dao.impl.TagFinanceDAOImpl;
import com.example.tagfinance.data.dto.TagFinanceDTO;
import com.example.tagfinance.data.entity.TagFinance;
import com.example.tagfinance.service.TagFinanceService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagFinanceServiceImpl implements TagFinanceService {
    private final TagFinanceDAO tagFinanceDAO = new TagFinanceDAOImpl();
    public static List<TagFinanceDTO> tagFinanceDTOS = new ArrayList<>();


    @Override
    public List<TagFinanceDTO> getAll() {
        List<TagFinance> tagFinanceList = tagFinanceDAO.getTagFinanceList();
        for (int i = 0; i < tagFinanceList.size(); i++) {
            TagFinanceDTO tagFinanceDTO = new TagFinanceDTO(tagFinanceList.get(i));
            tagFinanceDTOS.add(tagFinanceDTO);
        }
        return tagFinanceDTOS;
    }

    @Override
    public TagFinance insert(TagFinance tagFinance) {
        tagFinanceDAO.insertTagFinance(tagFinance);
        return tagFinance;
    }

    @Override
    public void update(TagFinance tagFinance, int id) {
        tagFinanceDAO.updateTagFinance(tagFinance, id);


    }

    @Override
    public void delete(int id) {
        tagFinanceDAO.deleteTagFinance(id);

    }
}