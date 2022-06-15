package com.example.calcetto.repository;

import com.example.calcetto.model.TbGestore;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbGestoreRepository extends TbGestoreCustomRepository, JpaRepository<TbGestore, Long> {
}
