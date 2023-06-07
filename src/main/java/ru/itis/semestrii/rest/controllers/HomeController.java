package ru.itis.semestrii.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.itis.semestrii.rest.dto.CountryDto;
import ru.itis.semestrii.rest.services.CountryService;
import java.util.List;

@Controller
public class HomeController {

  @Autowired
  private CountryService countryService;

  @GetMapping("/home")
  public String index(Model model, @RequestParam("page") Integer page){
    List<CountryDto> countries = countryService.findAll(page);

    model.addAttribute("countries", countries);

    return "index";
  }
}
