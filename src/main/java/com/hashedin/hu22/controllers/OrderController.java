package com.hashedin.hu22.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hashedin.hu22.dto.cart.CartDto;
import com.hashedin.hu22.dto.order.CheckoutItemDto;
import com.hashedin.hu22.entities.Cart;
import com.hashedin.hu22.entities.Order;
import com.hashedin.hu22.repositories.OrderDao;
import com.hashedin.hu22.services.CartService;
import com.hashedin.hu22.services.OrderService;

@CrossOrigin("*")
@RestController
@RequestMapping("/order")
public class OrderController {
	
	
	@Autowired
	OrderDao orderDao;
	
	@Autowired
	CartService cartService;
	
	
	@GetMapping("/{userId}")
	public Order getCartId(@PathVariable long userId){
		
		List<Cart> listnew= cartService.listCartItemsByUserId(userId);
		Order userOrder = new Order();
		userOrder.setOrderCart(listnew);
//		userOrder.setTotalCost("123.3");
		orderDao.save(userOrder);
		return userOrder;
		
		
	}
}
