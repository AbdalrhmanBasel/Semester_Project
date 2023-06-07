package ru.itis.semestrii.rest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.semestrii.rest.dto.CountryDto;
import ru.itis.semestrii.rest.model.Country;
import ru.itis.semestrii.rest.repositoryes.CountryRepository;
import ru.itis.semestrii.rest.repositoryes.CurrencyRepository;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository repository;
    @Autowired
    private CurrencyRepository currencyRepository;

    public List<CountryDto> getAllCountries() {
        List<Country> lst = repository.getAll();

        List<CountryDto> result = lst
                .stream()
                .map(country -> new CountryDto(country))
                .toList();
        return result;
    }

    public CountryDto edit(Long id, CountryDto countryDto){
        Country country = repository.findById(id).get();
        country.setName(countryDto.getName());
        country.setAlpha3(countryDto.getAlpha3());

        return new CountryDto(repository.save(country));
    }

    public CountryDto save(CountryDto countryDto, Long currencyId){
        Country country = new Country();
        country.setName(countryDto.getName());
        country.setCurrency(currencyRepository.findById(currencyId).get());
        country.setAlpha3(countryDto.getAlpha3());

        return new CountryDto(repository.save(country));
    }

    public List<CountryDto> findAll(Integer page){
        return repository.findAll(page).stream()
                .map(country -> new CountryDto(country))
                .toList();
    }
}
