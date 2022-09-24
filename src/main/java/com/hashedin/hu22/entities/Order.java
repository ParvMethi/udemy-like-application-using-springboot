package com.hashedin.hu22.entities;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.hashedin.hu22.dto.cart.CartDto;

@Entity(name="orderjj")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "order_id")
	private long orderId;
	
	
	
//	private String totalCost;
//	
//	public String getTotalCost() {
//		return totalCost;
//	}
//
//	public void setTotalCost(String totalCost) {
//		this.totalCost = totalCost;
//	}

	
	public Order() {
		super();
	}
	
	@OneToMany
	@JoinColumn(name="corder_id")
	List<Cart> orderCart;
	

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public List<Cart> getOrderCart() {
		return orderCart;
	}

	public void setOrderCart(List<Cart> orderCart) {
		this.orderCart = orderCart;
	}

	
	
	
	
}
