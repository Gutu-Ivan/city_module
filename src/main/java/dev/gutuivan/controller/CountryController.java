package dev.gutuivan.controller;

import dev.gutuivan.repository.CountriesRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")

public class CountryController {
    CountriesRepository countriesRepository = new CountriesRepository();

    @PostMapping("countries")
    public String createCountry(@RequestParam String countryName, @RequestParam Integer cityId){
        return countriesRepository.createCountry(countryName, cityId);
    }
    @GetMapping("countries/{id}")
    public String readCountry(@PathVariable Integer id){
        return countriesRepository.readCountry(id);
    }
    @GetMapping("countries/all")
    public String readAllCountries(){
        return countriesRepository.readAllCountries();
    }
    @PutMapping("countries/{id}")
    public String updateCountry(@PathVariable Integer id, @RequestParam String countryName){
        return countriesRepository.updateCountry(id, countryName);
    }
    @DeleteMapping("countries/{id}")
    public String deleteCountry(@PathVariable Integer id){
        return countriesRepository.deleteCountry(id);
    }
}
