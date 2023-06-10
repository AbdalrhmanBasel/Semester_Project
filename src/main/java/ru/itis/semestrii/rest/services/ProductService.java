package ru.itis.semestrii.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.semestrii.rest.dto.ProductDto;
import ru.itis.semestrii.rest.model.Product;
import ru.itis.semestrii.rest.repositoryes.ProductRepository;

import java.util.List;

@Service
public class ProductService {
  @Autowired
  private ProductRepository productRepository;

  public List<ProductDto> findAll(){
    return productRepository
            .all()
            .stream()
            .map(product -> new ProductDto(product))
            .toList();
  }

  public void save(ProductDto productDto){
    Product product = new Product();
    product.setCurrency(productDto.getCurrency());
    product.setPrice(productDto.getPrice());
    product.setCountry(productDto.getCountry());
    product.setName(productDto.getName());


    productRepository.save(product);
  }
}
