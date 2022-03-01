package com.beliy.springbootrest.repository;

import com.beliy.springbootrest.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
