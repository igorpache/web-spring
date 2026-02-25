package com.coursejava.course.repositories;

import com.coursejava.course.entities.Category;
import com.coursejava.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
