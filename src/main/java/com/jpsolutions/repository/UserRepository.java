package com.jpsolutions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpsolutions.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{
    User getUserByEmail(String email);
}
