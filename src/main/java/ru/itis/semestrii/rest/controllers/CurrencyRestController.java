package ru.itis.semestrii.rest.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itis.semestrii.rest.dto.CurrencyDto;
import ru.itis.semestrii.rest.services.CurrencyService;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/currency")
public class CurrencyRestController {

    @Autowired
    private CurrencyService service;

    @GetMapping("/all")
    public List<CurrencyDto> index(){
        return service.getAll();
    }

    @PostMapping("/create")
    public CurrencyDto createCurrency(@RequestBody CurrencyDto currencyDto){
        return service.save(currencyDto);
    }
}
