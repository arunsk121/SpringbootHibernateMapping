package com.H2.DbTrial;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.H2.DbModels.Role;
import com.H2.DbModels.User;
import com.H2.Repositories.RoleRepo;
import com.H2.Repositories.UserRepo;

@Service
public class RestService {

	@Autowired
	private UserRepo userRepo;
	@Autowired
	private RoleRepo roleRepo;
	
	public void postData(User user) {
		userRepo.save(user);
	}

	public List<User> getAll() {
		List<User> list = new ArrayList<>();
		userRepo.findAll().forEach(list::add);
		return list;
	}

	public List<Role> getAllRoles() {
		List<Role> list = new ArrayList<>();
		roleRepo.findAll().forEach(list::add);
		return list;
	}

	public User getById(int id) {
		return userRepo.findById(id).get();
	}
}
