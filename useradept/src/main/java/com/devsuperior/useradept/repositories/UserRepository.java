package com.devsuperior.useradept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.useradept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
