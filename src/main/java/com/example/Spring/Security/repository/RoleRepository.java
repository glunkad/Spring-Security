package com.example.Spring.Security.repository;

import com.example.Spring.Security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface RoleRepository extends JpaRepository<Role, Long>{
    Optional<Role> findByName(String name);
}
