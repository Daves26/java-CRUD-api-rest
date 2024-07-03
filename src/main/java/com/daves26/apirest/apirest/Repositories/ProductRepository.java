package com.daves26.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daves26.apirest.apirest.Entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
