package com.example.calcetto.repository;

import com.example.calcetto.model.TbTipoAttivita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbTipoAttivitaRepository extends TbTipoAttivitaCustomRepository, JpaRepository<TbTipoAttivita, Long> {
}
