package com.H2.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.H2.DbModels.CartProduct;

public interface CartProductRepo extends CrudRepository<CartProduct, Integer> {

}
