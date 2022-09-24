package com.hashedin.hu22.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hashedin.hu22.entities.Order;

public interface OrderDao extends JpaRepository<Order, Long>{

}
