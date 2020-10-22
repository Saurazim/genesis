package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.EleveurEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EleveurDao extends JpaRepository<EleveurEntity, Integer> {
}
