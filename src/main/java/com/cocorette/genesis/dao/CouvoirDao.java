package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.CouvoirEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouvoirDao extends JpaRepository<CouvoirEntity, Integer> {
}
