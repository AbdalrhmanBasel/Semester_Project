package ru.itis.semestrii.rest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import ru.itis.semestrii.rest.model.Currency;

@Getter@Setter@ToString
public class CurrencyDto {

    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("symbol")
    private String symbol;

    public CurrencyDto(){}

    public CurrencyDto(Currency currency){
        this.id = currency.getId();
        this.name = currency.getName();
        this.symbol = currency.getSymbol();
    }

}
