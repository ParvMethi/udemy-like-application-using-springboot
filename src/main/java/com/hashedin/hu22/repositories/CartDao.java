package com.hashedin.hu22.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hashedin.hu22.entities.Cart;

@Repository
public interface CartDao extends JpaRepository<Cart, Long>{
	
	@Query(value="SELECT * FROM Cart WHERE user_Id = :userId", nativeQuery=true)
	List<Cart> findByUserId(@Param("userId")long userId );
//	List<Cart> findAllById(long userId);
	
}
