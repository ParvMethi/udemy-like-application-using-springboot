package com.hashedin.hu22.dto.cart;

import javax.persistence.Embeddable;

import com.hashedin.hu22.entities.Cart;
import com.hashedin.hu22.entities.Course;


public class CartItemDto {
	
	private long id;
	private Course course;
	
	public CartItemDto() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	public CartItemDto(Cart cart) {
		this.id = cart.getCartId();
		this.setCourse(cart.getCourse());
	}
	
	
}
