package ru.itis.semestrii.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itis.semestrii.rest.dto.CountryDto;
import ru.itis.semestrii.rest.dto.CurrencyDto;
import ru.itis.semestrii.rest.services.CountryService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/country")//service name
public class CountryRestController {

    @Autowired
    private CountryService service;

    @GetMapping("/all")
    public List<CountryDto> getAllCountry() {
        return service.getAllCountries();
    }

    @PostMapping("/{currency_id}/create")
    public CountryDto createCountry(@PathVariable("currency_id") Long currencyId,  @RequestBody CountryDto countryDto){
        return service.save(countryDto, currencyId);
    }

    @PutMapping("/{country_id}/edit")
    public CountryDto editCountry(@PathVariable("country_id") Long id, @RequestBody CountryDto countryDto){
        return service.edit(id, countryDto);
    }

}
