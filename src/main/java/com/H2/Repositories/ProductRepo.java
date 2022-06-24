package com.H2.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.H2.DbModels.Product;

public interface ProductRepo extends CrudRepository<Product, Integer> {

}
