package com.aprendendoSpringBoot.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpringBoot.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
