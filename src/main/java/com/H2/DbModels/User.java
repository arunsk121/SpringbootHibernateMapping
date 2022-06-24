package com.H2.DbModels;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue
	private int userId;
	private String username;
	private String password;
	@OneToOne(mappedBy = "user")
	@JsonIgnore
	private Cart cart;
	@OneToMany(mappedBy = "seller")
	@JsonIgnore
	private List<Product> products;
	@ManyToMany
	@JsonIgnore
	@JoinTable(
				name="UserRole",
				joinColumns = @JoinColumn(name="userId"),
				inverseJoinColumns = @JoinColumn(name="roleId")
			)
	private List<Role> roles;
//	@ManyToMany(mappedBy = "seller")
//	private List<Product> products;
	public User(int userId, String username, String password, Cart cart, List<Product> products, List<Role> roles) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.cart = cart;
		this.products = products;
		this.roles = roles;
	}
public User() {
	super();
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Cart getCart() {
	return cart;
}
public void setCart(Cart cart) {
	this.cart = cart;
}
public List<Product> getProducts() {
	return products;
}
public void setProducts(List<Product> products) {
	this.products = products;
}
public List<Role> getRoles() {
	return roles;
}
public void setRoles(List<Role> roles) {
	this.roles = roles;
}
	
	
	
	

}
