package com.example.calcetto.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

public class TbPrenotazioneCustomRepositoryImpl implements TbPrenotazioneCustomRepository {
    @Autowired
    EntityManager em;
}
