package com.proselyte.springbootrest.repository;

import com.proselyte.springbootrest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
