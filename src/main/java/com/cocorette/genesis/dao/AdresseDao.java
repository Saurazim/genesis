package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.AdresseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdresseDao extends JpaRepository<AdresseEntity, Integer> {
}
