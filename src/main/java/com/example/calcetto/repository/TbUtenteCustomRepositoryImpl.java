package com.example.calcetto.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class TbUtenteCustomRepositoryImpl implements TbUtenteCustomRepository {
    @Autowired
    EntityManager em;
}
