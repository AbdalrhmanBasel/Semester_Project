package ru.itis.semestrii.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.semestrii.rest.dto.CurrencyDto;
import ru.itis.semestrii.rest.model.Currency;
import ru.itis.semestrii.rest.repositoryes.CurrencyRepository;

import java.util.List;

@Service
public class CurrencyService {

    @Autowired
    private CurrencyRepository currencyRepository;

    public List<CurrencyDto> getAll(){
        return currencyRepository
                .findAll()
                .stream()
                .map(currency -> new CurrencyDto(currency))
                .toList();
    }

    public CurrencyDto save(CurrencyDto currencyDto){

        Currency currency = new Currency();
        currency.setName(currencyDto.getName());
        currency.setSymbol(currencyDto.getSymbol());
        return new CurrencyDto(currencyRepository.save(currency));
    }
}
