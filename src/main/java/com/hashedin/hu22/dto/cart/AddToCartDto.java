package com.hashedin.hu22.dto.cart;

import javax.validation.constraints.NotNull;

public class AddToCartDto {
	
//	private long cartId;
	private @NotNull long courseId;
	private @NotNull int quantity;
	
	private @NotNull long userId;
	
	
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public AddToCartDto() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public long getCartId() {
//		return cartId;
//	}
//
//	public void setCartId(long cartId) {
//		this.cartId = cartId;
//	}

	public long getCourseId() {
		return courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
