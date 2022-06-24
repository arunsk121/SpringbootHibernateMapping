package com.H2.DbModels;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Product {
	
	@Id
	@GeneratedValue
	private int productId;
	private String productName;
	private double price;
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="sellerId")
	private User seller;
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category category;
//	@ManyToMany(mappedBy = "products")
//	private List<User> users;
	@OneToOne(mappedBy = "product")
	private CartProduct cartProduct;
	public Product(String productName, double price, User seller, Category category, 
			CartProduct cartProduct) {
		super();
		this.productName = productName;
		this.price = price;
		this.seller = seller;
		this.category = category;
//		this.users = users;
		this.cartProduct = cartProduct;
	}
	public Product() {
		super();
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public User getSeller() {
		return seller;
	}
	public void setSeller(User seller) {
		this.seller = seller;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
//	public List<User> getUsers() {
//		return users;
//	}
//	public void setUsers(List<User> users) {
//		this.users = users;
//	}
	public CartProduct getCartProduct() {
		return cartProduct;
	}
	public void setCartProduct(CartProduct cartProduct) {
		this.cartProduct = cartProduct;
	}
	
	
	

}
