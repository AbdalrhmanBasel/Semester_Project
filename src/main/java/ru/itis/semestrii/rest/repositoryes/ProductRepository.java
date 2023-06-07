package ru.itis.semestrii.rest.repositoryes;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.itis.semestrii.rest.model.Product;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

  @Query("select p from Product p")
  List<Product> all();
}
