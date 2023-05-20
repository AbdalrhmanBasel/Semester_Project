package ru.itis.semestrii.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
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

    public void delete(Long id){
        currencyRepository.deleteById(id);
    }

    @Transactional
    public CurrencyDto update(Long currentcyId, CurrencyDto currencyDto){
        Currency currency = currencyRepository.findById(currentcyId).get();

        currency.setName(currencyDto.getName());
        currency.setSymbol(currencyDto.getSymbol());
        return new CurrencyDto(currencyRepository.save(currency));
    }

    public CurrencyDto findById(Long id){
        return new CurrencyDto(currencyRepository.findById(id).get());
    }
}
