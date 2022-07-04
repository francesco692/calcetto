package com.example.calcetto.service;

import com.example.calcetto.model.TbSlot;
import com.example.calcetto.model.TbUtente;
import com.example.calcetto.repository.TbSlotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TbSlotService {
    @Autowired
    TbSlotRepository repo;

    public TbSlot save(TbSlot data) throws Exception
    {
        TbSlot result;
        try
        {
            result = repo.save(data);
        }
        catch (Exception e)
        {
            throw new Exception(e.getMessage());
        }
        return result;
    }
    public TbSlot deleteSlot(Long slotId) throws Exception {
        try
        {
            repo.deleteById(slotId);
        }
        catch (Exception e)
        {
            throw new Exception("la riga che hai cercato di eliminare è collegata ad un altra tabella", e);
        }
        return null;
    }
}
