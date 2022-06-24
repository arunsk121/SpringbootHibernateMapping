package com.H2.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.H2.DbModels.Role;

public interface RoleRepo extends CrudRepository<Role, Integer> {

}
