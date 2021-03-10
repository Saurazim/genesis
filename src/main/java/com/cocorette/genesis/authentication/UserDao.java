package com.cocorette.genesis.authentication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserEntity, String> {
}
