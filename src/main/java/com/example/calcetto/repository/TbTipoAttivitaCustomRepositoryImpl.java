package com.example.calcetto.repository;

import com.example.calcetto.model.TbAttivita;
import com.example.calcetto.model.TbGestore;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class TbTipoAttivitaCustomRepositoryImpl implements TbTipoAttivitaCustomRepository {
    @Autowired
    EntityManager em;
}
