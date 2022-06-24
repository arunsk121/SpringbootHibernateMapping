package com.H2.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.H2.DbModels.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

}
