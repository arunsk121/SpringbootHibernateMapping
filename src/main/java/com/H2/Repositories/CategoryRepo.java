package com.H2.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.H2.DbModels.Category;

public interface CategoryRepo extends CrudRepository<Category, Integer> {

}
