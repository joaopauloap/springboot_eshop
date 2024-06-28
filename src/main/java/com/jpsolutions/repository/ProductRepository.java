package com.jpsolutions.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpsolutions.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{
    Product getProductByName(String name);
}
