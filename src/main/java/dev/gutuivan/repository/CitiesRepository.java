package dev.gutuivan.repository;

import dev.gutuivan.model.CityModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CitiesRepository {

    String[] cities = {"Balti", "Chisinau", "Orhei", "Cahul"};
    List<String> citiesList = Arrays.asList(cities);
    ArrayList<CityModel> citiesModel = new ArrayList<CityModel>();


    public String createCity(String cityName){
        CityModel city = new CityModel(cityName);
        this.citiesModel.add(city);
        this.citiesList.add(cityName);
        return String.valueOf(this.citiesModel);
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
    public String deleteCity(Integer id){
        this.citiesList.remove(this.citiesList.get(id));
        return this.citiesList.toString();
    }




}
