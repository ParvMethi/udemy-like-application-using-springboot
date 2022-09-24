package com.hashedin.hu22.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hashedin.hu22.dto.cart.AddToCartDto;
import com.hashedin.hu22.dto.cart.CartDto;
import com.hashedin.hu22.dto.cart.CartItemDto;
import com.hashedin.hu22.entities.Cart;
import com.hashedin.hu22.entities.Course;
import com.hashedin.hu22.entities.User;
import com.hashedin.hu22.exceptions.CustomException;
import com.hashedin.hu22.repositories.CartDao;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	CourseService courseService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	CartDao cartDao;

	@Override
	public void addToCart(AddToCartDto addToCartDto) {
		
		//validate if product id is valid
		Course course = courseService.findById(addToCartDto.getCourseId());
		User user = userService.findById(addToCartDto.getUserId());
//		System.out.println(user.getUserId());
		Cart cart = new Cart();
		cart.setCourse(course);
		cart.setQuantity(addToCartDto.getQuantity());
		cart.setUser(user);
		//save the cart
		cartDao.save(cart);
	}

	@Override
	public CartDto listCartItems(long userId) {
		List<Cart> cartList = cartDao.findByUserId(userId);
		
		
		List<CartItemDto> cartItems = new ArrayList<>();
		double totalCost = 0;
		for(Cart cart : cartList) {
			CartItemDto cartItemDto = new CartItemDto(cart);
			totalCost += cart.getCourse().getCoursePrice();
			cartItems.add(cartItemDto);
		}
		CartDto cartDto = new CartDto();
		cartDto.setTotalCost(totalCost);
		cartDto.setCartItems(cartItems);
		
		return cartDto;
	}
	
	@Override
	public List<Cart> listCartItemsByUserId(long userId) {
		List<Cart> cartList = cartDao.findByUserId(userId);
		
		
		return cartList;
	}
	
	@Override
	public void deleteCartItem(long cartItemId, long userId) {
		
		//the item id belongs to user
		Optional<Cart> optionalCart = cartDao.findById(cartItemId);
		
		if(optionalCart.isEmpty()) {
			throw new CustomException("cart Item id is invalid: " + cartItemId);
		}
		
		Cart cart = optionalCart.get();
		
		if(cart.getUser().getUserId() != userId) {
			throw new CustomException("cart item doesn't belong to user: " +cartItemId);
		}
		
		cartDao.delete(cart);
	}
	

}
