package com.dev.sayan.blogapi.repositories;

import com.dev.sayan.blogapi.entities.UserAuthEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserAuthRepository extends JpaRepository<UserAuthEntity,Long> {
    Optional<UserAuthEntity> findByUsername(String username);
}
