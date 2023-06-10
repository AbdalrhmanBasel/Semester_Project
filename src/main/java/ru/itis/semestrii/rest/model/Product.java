package ru.itis.semestrii.rest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Product {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SequenceProduct")
  private Long id;
  private String price;
  private String name;

  @ManyToOne
  private Country country;
  @ManyToOne
  private Currency currency;
}
