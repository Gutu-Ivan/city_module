package dev.gutuivan.controller;

import dev.gutuivan.repository.CitiesRepository;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/")

public class CityController {
    CitiesRepository citiesRepository = new CitiesRepository();

    @PostMapping("cities")
    public String createCity(@RequestParam String cityName){
        return citiesRepository.createCity(cityName);
    }
    @GetMapping("cities/{id}")
    public String readCity(@PathVariable Integer id){
        return citiesRepository.readCity(id);
    }
    @GetMapping("cities/all")
    public String readAllCities(){
        return citiesRepository.readAllCities();
    }
    @PutMapping("cities/{id}")
    public String updateCity(@PathVariable Integer id, @RequestParam String cityName){
        return citiesRepository.updateCity(id, cityName);
    }
    @DeleteMapping("cities/{id}")
    public String deleteCity(@PathVariable Integer id){
        return citiesRepository.deleteCity(id);
    }
}
