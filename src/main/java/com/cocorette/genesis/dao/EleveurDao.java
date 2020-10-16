package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.Eleveur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EleveurDao extends JpaRepository<Eleveur, Integer> {
}
