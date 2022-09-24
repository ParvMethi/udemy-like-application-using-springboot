package com.hashedin.hu22.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hashedin.hu22.dto.cart.AddToCartDto;
import com.hashedin.hu22.dto.cart.CartDto;
import com.hashedin.hu22.services.CartService;
import com.hashedin.hu22.services.CourseService;

import io.swagger.annotations.ApiResponse;


@CrossOrigin("*")
@RestController
@RequestMapping("/cart")
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	
	//post cart api
	@PostMapping("/add")
	public ResponseEntity<String> addToCart(@RequestBody AddToCartDto addToCartDto){
		
		cartService.addToCart(addToCartDto);
		return ResponseEntity.status(HttpStatus.OK) .body("Added to Cart ");
	}
	
	
	//get all cart items
	@GetMapping("/cart/{userId}")
	public ResponseEntity<CartDto> getCartItems(@PathVariable String userId){
		CartDto cartDto = cartService.listCartItems(Long.parseLong(userId));
		return new ResponseEntity<>(cartDto, HttpStatus.OK);
	}
	
	//delete a cart items
	@DeleteMapping("/delete/{cartItemId}")
	public ResponseEntity<String> deleteCartItem(@PathVariable("cartItemId") String itemId, String userId) {
		cartService.deleteCartItem(Long.parseLong(itemId), Long.parseLong(userId));
		return ResponseEntity.status(HttpStatus.OK) .body("Item has been removed");
	}
	
	
}
