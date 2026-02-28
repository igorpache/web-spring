package com.coursejava.course.repositories;

import com.coursejava.course.entities.Category;
import com.coursejava.course.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
