package com.example.calcetto.service;

import com.example.calcetto.model.TbGestore;
import com.example.calcetto.repository.TbGestoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class TbGestoreService
{
    @Autowired
    TbGestoreRepository repo;

    public TbGestore save(TbGestore data) throws Exception {
        TbGestore result;
        try {
            result = repo.save(data);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return result;
    }
    public TbGestore deleteGestore(Long gestoreId) throws Exception {
        try
        {
            repo.deleteById(gestoreId);
        }
        catch (Exception e)
        {
            throw new Exception("la riga che hai cercato di eliminare è collegata ad un altra tabella", e);
        }
        return null;
    }
}
