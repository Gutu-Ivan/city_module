package dev.gutuivan.repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CitiesRepository {

    String[] cities = {"Balti", "Chisinau", "Orhei", "Cahul"};
    List<String> citiesList = Arrays.asList(cities);


    public String createCity(String cityName){
        this.citiesList.add(cityName);
        return cityName + "is created";
    }
    public String readCity(Integer id){
        return this.citiesList.get(id);
    }
    public String readAllCities(){
        return this.citiesList.toString();
    }

    public String updateCity(Integer id, String cityName){
        return this.citiesList.set(id, cityName);
    }
    public String deleteCity(){
        return "";
    }




}
