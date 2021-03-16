package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.ArriveeEauEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArriveeEauDao extends JpaRepository<ArriveeEauEntity, Integer> {
}
