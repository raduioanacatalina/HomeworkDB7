package com.raducatalianhomework7.raducatalianhomework7.service;

import com.raducatalianhomework7.raducatalianhomework7.model.Product;
import com.raducatalianhomework7.raducatalianhomework7.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public List<Product> getRemainingProducts(){
        return productRepository.getRemainingProducts();
    }

    public void deleteProductByCode(Integer code){
        productRepository.deleteProductByCode(code);
    }

    public void update(Integer code, Integer stock){
        productRepository.update(code, stock);
    }

    public void decrement(Integer code){
        productRepository.decrement(code);
    }

    public void increment(Integer code){
        productRepository.increment(code);
    }

    public void insert(Product product){
        productRepository.save(product);
    }
}
