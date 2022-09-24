package com.hashedin.hu22.services;

import java.util.List;

import com.hashedin.hu22.dto.cart.AddToCartDto;
import com.hashedin.hu22.dto.cart.CartDto;
import com.hashedin.hu22.entities.Cart;

public interface CartService {

	public void addToCart(AddToCartDto addToCartDto);

	public CartDto listCartItems(long userId);

	public void deleteCartItem(long itemId, long userId);
	
	public List<Cart> listCartItemsByUserId(long userId);

}
