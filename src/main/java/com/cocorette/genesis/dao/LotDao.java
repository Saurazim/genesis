package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.LotEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LotDao extends JpaRepository<LotEntity, Integer> {
}
