package ru.itis.semestrii.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.itis.semestrii.rest.model.Country;
import ru.itis.semestrii.rest.model.Currency;

@Getter@Setter@ToString
public class CountryDto extends AbstractDto {
    private Long id;
    @JsonProperty("alpha3")
    private String alpha3;
    @JsonProperty("currency")
    private Currency currency;
    @JsonProperty("currency_id")
    private Long currencyId;
    @JsonProperty("name")
    private String name;

    public CountryDto() {}

    public CountryDto(Country country) {
        this.name = country.getName();
        this.id = country.getId();
        this.alpha3 = country.getAlpha3();
        this.currency = country.getCurrency();
    }
}
