package com.cocorette.genesis.dao;

import com.cocorette.genesis.model.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactDao extends JpaRepository<ContactEntity, Integer> {
}
