package ru.itis.semestrii.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.itis.semestrii.rest.model.Country;
import ru.itis.semestrii.rest.model.Currency;
import ru.itis.semestrii.rest.model.Product;

@Getter
@Setter
@ToString
public class ProductDto{

  private Long id;
  @JsonProperty("price")
  private String price;
  @JsonProperty("currency")
  private Currency currency;
  @JsonProperty("country")
  private Country country;
  @JsonProperty("name")
  private String name;

  public ProductDto() {}

  public ProductDto(Product product) {
    this.price = product.getPrice();
    this.currency = product.getCurrency();
    this.country = product.getCountry();
    this.name = product.getName();
  }
}

