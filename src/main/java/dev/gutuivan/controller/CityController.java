package dev.gutuivan.controller;

import dev.gutuivan.repository.CitiesRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")

public class CityController {
    CitiesRepository citiesRepository = new CitiesRepository();

    @PostMapping("cities")
    public String createCity(@RequestParam String cityName){
        return citiesRepository.createCity(cityName);
    }
    @GetMapping("cities/{id}")
    public String readCity(@RequestParam Integer id){
        return citiesRepository.readCity(id);
    }
    @GetMapping("cities")
    public String readAllCities(){
        return citiesRepository.readAllCities();
    }
    @PutMapping("cities")
    public String updateCity(){
        return "";
    }
    @DeleteMapping("cities")
    public String deleteCity(){
        return "";
    }
}
