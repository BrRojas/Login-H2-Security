package com.Login_in_memory.Login.in.memory.repository;

import com.Login_in_memory.Login.in.memory.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findByName(String name);
}
