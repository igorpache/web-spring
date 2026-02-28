package com.coursejava.course.services;

import com.coursejava.course.entities.Products;
import com.coursejava.course.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {

    @Autowired
    private ProductsRepository repository;

    public List<Products> findAll() {
        return repository.findAll();
    }

    public Products findById(Long id) {
        Optional<Products> obj = repository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException("Products not found"));
    }
}
