package ru.itis.semestrii.rest.controllers;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itis.semestrii.rest.dto.CountryDto;
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
        return service.getAll();
    }
    @PostMapping("/create")
    public CountryDto createCountry(@RequestBody CountryDto countryDto){
        return service.save(countryDto);
    }
}