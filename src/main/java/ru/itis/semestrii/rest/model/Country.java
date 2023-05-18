package ru.itis.semestrii.rest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter@Setter
@Entity
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SequenceCountry")
    private Long id;
    private String alpha3;
    private String name;

    @ManyToOne
    private Currency currency;
}
