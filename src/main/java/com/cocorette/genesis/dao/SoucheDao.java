package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.SoucheEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoucheDao extends JpaRepository<SoucheEntity, Integer> {
}
