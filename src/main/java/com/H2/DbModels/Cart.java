package com.H2.DbModels;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue
	private int CartId;
	private double totalAmount;
	@OneToOne
	@JsonIgnore
	@JoinColumn(name="userId")
	private User user;
	@OneToMany(mappedBy = "cart")
	private List<CartProduct> cartProducts;
	
	
	public Cart() {
		super();
	}


	public Cart(double totalAmount, User user, List<CartProduct> cartProducts) {
		super();
		this.totalAmount = totalAmount;
		this.user = user;
		this.cartProducts = cartProducts;
	}


	public int getCartId() {
		return CartId;
	}


	public void setCartId(int cartId) {
		CartId = cartId;
	}


	public double getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public List<CartProduct> getCartProducts() {
		return cartProducts;
	}


	public void setCartProducts(List<CartProduct> cartProducts) {
		this.cartProducts = cartProducts;
	}
	
	

}
