package com.example.calcetto.repository;

import com.example.calcetto.model.TbSlot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TbSlotRepository extends TbSlotCustomRepository, JpaRepository<TbSlot, Long> {
}
