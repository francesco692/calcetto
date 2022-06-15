package com.example.calcetto.service;

import com.example.calcetto.model.TbGestore;
import com.example.calcetto.model.TbUtente;
import com.example.calcetto.repository.TbGestoreRepository;
import com.example.calcetto.repository.TbUtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class TbUtenteService
{
    @Autowired
    TbUtenteRepository repo;
    @Autowired
    TbGestoreRepository repoGestore;
    public TbUtente save(TbUtente data) throws Exception {
        TbUtente result;
        try {
            result = repo.save(data);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return result;
    }
    public TbUtente deleteUtente(Long utenteId) throws Exception {
        try
        {
            repo.deleteById(utenteId);
        }
        catch (Exception e)
        {
            throw new Exception("la riga che hai cercato di eliminare è collegata ad un altra tabella", e);
        }
        return null;
    }
    public List<TbGestore> visualizzaDisponibili() throws Exception
    {
        List<TbGestore> result = new ArrayList<TbGestore>();
        try {
            result = repoGestore.disponibilita();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
        return result;
    }
    public List<TbGestore> localita(String citta) throws Exception
    {
        List<TbGestore> result = new ArrayList<TbGestore>();
        try
        {
            result = repoGestore.localita(citta);
        }
        catch (Exception e)
        {
            throw new Exception(e.getMessage());
        }
        return result;
    }
    public List<TbGestore> findByPrezzo(String prezzo) throws Exception
    {
        List<TbGestore> result = new ArrayList<TbGestore>();
        try
        {
            result = repoGestore.findByPrezzo(prezzo);
        }
        catch (Exception e)
        {
            throw new Exception(e.getMessage());
        }
        return result;
    }
}
