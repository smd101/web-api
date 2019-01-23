package com.example.sandbox.service;
import com.example.sandbox.entity.Product;
import com.example.sandbox.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  public Optional<Product> findProduct(Long id){
    return productRepository.findById(id);
  }

  public List<Product> findProducts(){
    return productRepository.findAll();
  }

  public Product save(Product product) {
    return productRepository.save(product);
  }

  public void delete(Long id) {
    productRepository.deleteById(id);
  }
}