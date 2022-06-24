package com.H2.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.H2.DbModels.Cart;

public interface CartRepo extends CrudRepository<Cart, Integer> {

}
