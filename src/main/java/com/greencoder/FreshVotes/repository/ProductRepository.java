package com.greencoder.FreshVotes.repository;

import com.greencoder.FreshVotes.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
