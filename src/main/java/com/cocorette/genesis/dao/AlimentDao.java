package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.AlimentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentDao extends JpaRepository<AlimentEntity, Integer> {
}
