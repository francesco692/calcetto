package com.example.calcetto.repository;

import com.example.calcetto.model.TbGestore;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class TbGestoreCustomRepositoryImpl implements TbGestoreCustomRepository {
    @Autowired
    EntityManager em;
    @Override
    public List<TbGestore> localita(String citta)
    {
        List<TbGestore> result = new ArrayList<TbGestore>();
        String query = "select * from tb_gestore tg where citta = '"+citta+"'";
        Query a = em.createNativeQuery(query,TbGestore.class);
        result = a.getResultList();
        return result;
    }
}
