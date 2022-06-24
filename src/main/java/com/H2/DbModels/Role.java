package com.H2.DbModels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
@Table
public class Role {
	@Id
	@GeneratedValue
	private int roleId;
	private String role;
	@ManyToMany(mappedBy = "roles")
	@JsonIgnore
	private List<User> users;
	public Role() {
		super();
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public Role(String role, List<User> users) {
		super();
		this.role = role;
		this.users = users;
	}
	
	

}
