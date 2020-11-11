package com.greencoder.FreshVotes.repository;

import com.greencoder.FreshVotes.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
