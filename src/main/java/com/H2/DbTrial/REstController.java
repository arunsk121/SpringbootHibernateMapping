package com.H2.DbTrial;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.H2.DbModels.Role;
import com.H2.DbModels.User;

import ch.qos.logback.classic.Logger;

@RestController
@RequestMapping("/api")
public class REstController {

	@Autowired
	private RestService restService;
	
	@GetMapping("/")
	public List<Role> getAllRoles(){
		return restService.getAllRoles();
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return restService.getAll();
	}
	
	@GetMapping("/{id}")
	public User getById(@PathVariable("id") int id) {
		return restService.getById(id);
	}
	
	@PostMapping("/post")
	public String postData(@RequestBody User user) {
		restService.postData(user);
		if(HttpStatus.OK != null) {
			return "posted successfully";
		}
		return "error occured";
	}
}
