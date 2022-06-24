package com.H2.DbModels;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class CartProduct {
	@Id
	@GeneratedValue
	private int cpId;
	@ManyToOne
	@JoinColumn(name="cartId")
	private Cart cart;
	private int quantity;
	@OneToOne
	@JoinColumn(name="productId")
	private Product product;
	public CartProduct(Cart cart, int quantity, Product product) {
		super();
		this.cart = cart;
		this.quantity = quantity;
		this.product = product;
	}
	public CartProduct() {
		super();
	}
	public int getCpId() {
		return cpId;
	}
	public void setCpId(int cpId) {
		this.cpId = cpId;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
