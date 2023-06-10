package ru.itis.semestrii.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.itis.semestrii.rest.dto.CountryDto;
import ru.itis.semestrii.rest.dto.CurrencyDto;
import ru.itis.semestrii.rest.dto.ProductDto;
import ru.itis.semestrii.rest.services.CountryService;
import ru.itis.semestrii.rest.services.CurrencyService;
import ru.itis.semestrii.rest.services.ProductService;

import java.util.List;

@CrossOrigin
@Controller
@RequestMapping("products")
public class ProductsController {

  @Autowired
  private ProductService productService;

  @Autowired
  private CurrencyService currencyService;

  @Autowired
  private CountryService countryService;

  @GetMapping("/all")
  public String getAll(Model model){
    List<ProductDto> products = productService.findAll();
    model.addAttribute("products", products);
    return "products/all";
  }

  @GetMapping("new")
  public String newProducts(Model model){
    List<CountryDto> countries = countryService.getAllCountries();
    List<CurrencyDto> currencies = currencyService.getAll();

    model.addAttribute("countries", countries);
    model.addAttribute("currencies", currencies);
    return "products/new";
  }

  @PostMapping("/create")
  public String createProduct(ProductDto productDto, Model model){

    productService.save(productDto);
    List<ProductDto> products = productService.findAll();
    model.addAttribute("products", products);
    return "products/all";
  }
}
