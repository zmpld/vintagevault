package com.mapalad.ecommerce.services.customer;

import com.mapalad.ecommerce.dto.ProductDto;
import com.mapalad.ecommerce.entity.Product;
import com.mapalad.ecommerce.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerProductServiceImpl implements CustomerProductService{

    private final ProductRepository productRepository;

    public List<ProductDto> getAllProducts(){
        List<Product> products = productRepository.findAll();
        return products.stream().map(Product::getDto).collect(Collectors.toList());
    }

    public List<ProductDto> searchProductByTitle(String name){
        List<Product> products = productRepository.findAllByNameContaining(name);
        return products.stream().map(Product::getDto).collect(Collectors.toList());
    }

    public CustomerProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
