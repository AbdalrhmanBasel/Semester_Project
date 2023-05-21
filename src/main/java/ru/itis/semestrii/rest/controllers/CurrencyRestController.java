package ru.itis.semestrii.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itis.semestrii.rest.dto.CurrencyDto;
import ru.itis.semestrii.rest.services.CurrencyService;
import java.util.List;

@RestController
@RequestMapping("/currency")
@CrossOrigin
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

    @PutMapping("/edit/{id}")
    public CurrencyDto updateCurrency(@PathVariable("id") Long currencyId, @RequestBody CurrencyDto currencyDto){
        return service.update(currencyId, currencyDto);
    }

    @GetMapping("/{id}")
    public CurrencyDto showCurrency(@PathVariable("id") Long id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCurrency(@PathVariable("id")Long id){
        service.delete(id);
    }
}
