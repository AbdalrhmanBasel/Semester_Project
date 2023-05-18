package ru.itis.semestrii.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.semestrii.rest.dto.CountryDto;
import ru.itis.semestrii.rest.model.Country;
import ru.itis.semestrii.rest.repositoryes.CountryRepository;
import ru.itis.semestrii.rest.repositoryes.CurrencyRepository;

import java.util.Currency;
import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;
    @Autowired
    private CurrencyRepository currencyRepository;

    public List<CountryDto> getAll() {
        List<Country> lst = repository.getAll();

        List<CountryDto> result = lst
                .stream()
                .map(country -> new CountryDto(country))
                .toList();
        return result;
    }

    public CountryDto save(CountryDto countryDto){
        Country country = new Country();
        country.setName(countryDto.getName());
        country.setCurrency(currencyRepository.findById(countryDto.getCurrency()).get());
        country.setAlpha3(countryDto.getAlpha3());

        return new CountryDto(repository.save(country));
    }
}
