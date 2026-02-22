package com.coursejava.course.repositories;

import com.coursejava.course.entities.Order;
import com.coursejava.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}

