package dev.gutuivan.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")

public class CityController {

    @PostMapping("cities")
    public String createCity(){
        return "asd";
    }
    @GetMapping("cities")
    public String readCity(){
        return "";
    }
    @GetMapping("cities/{id}")
    public String readAllCities(){
        return "";
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
