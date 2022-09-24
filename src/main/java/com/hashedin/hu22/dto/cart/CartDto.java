package com.hashedin.hu22.dto.cart;

import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.Entity;


public class CartDto {
	
	private List<CartItemDto> cartItems;
	private double totalCost;
	
	public CartDto() {
		
	}

	public List<CartItemDto> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItemDto> cartItems) {
		this.cartItems = cartItems;
	}

	public double getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
	
	
}
