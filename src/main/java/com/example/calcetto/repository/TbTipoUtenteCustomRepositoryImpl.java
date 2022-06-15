package com.example.calcetto.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class TbTipoUtenteCustomRepositoryImpl implements TbTipoUtenteCustomRepository {
    @Autowired
    EntityManager em;
}
