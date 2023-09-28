package com.springBoot.repository;

import com.springBoot.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository extends JpaRepository<Product, long> {
}
