package dev.gutuivan.repository;

import dev.gutuivan.model.CityModel;

import java.util.ArrayList;

public class CitiesRepository {

    ArrayList<CityModel> cities = new ArrayList<>();


    public String createCity(String cityName){
        CityModel city = new CityModel(cityName);
        this.cities.add(city);
        return String.valueOf(this.cities);
    }
    public String readCity(Integer id){
        try{
            CityModel city = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            return city.toString();
        }catch (Exception exception){
            return "Not found";
        }
    }
    public String readAllCities(){
        return this.cities.toString();
    }

    public String updateCity(Integer id, String cityName){
        try{
            CityModel city = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            city.setName(cityName);
            return "City updated";
        }catch (Exception exception){
            return "Not found";
        }
    }
    public String deleteCity(Integer id){
        try{
            CityModel city = this.cities.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            if (city == null){
                return "Country not found";
            }
            this.cities.remove(city);
            return "Country deleted";
        }catch (Exception exception){
            return "Not found";
        }
    }




}
