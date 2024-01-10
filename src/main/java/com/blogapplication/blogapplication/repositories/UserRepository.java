package com.blogapplication.blogapplication.repositories;

import com.blogapplication.blogapplication.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
