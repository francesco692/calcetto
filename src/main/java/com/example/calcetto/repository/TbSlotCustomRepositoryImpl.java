package com.example.calcetto.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class TbSlotCustomRepositoryImpl implements TbSlotCustomRepository {
    @Autowired
    EntityManager em;
}
