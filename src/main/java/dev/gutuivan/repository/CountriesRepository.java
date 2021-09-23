package dev.gutuivan.repository;

import dev.gutuivan.model.CountryModel;

import java.util.ArrayList;

public class CountriesRepository {

    ArrayList<CountryModel> countries = new ArrayList<>();


    public String createCountry(String countryName, Integer cityId){
        CountryModel country = new CountryModel(countryName, cityId);
        this.countries.add(country);
        return String.valueOf(this.countries);
    }
    public String readCountry(Integer id){
        try{
            CountryModel country = this.countries.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            return country.toString();
        }catch (Exception exception){
            return "Not found";
        }
    }
    public String readAllCountries(){
        return this.countries.toString();
    }

    public String updateCountry(Integer id, String countryName){
        try{
            CountryModel country = this.countries.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            country.setName(countryName);
            return "Country updated";
        }catch (Exception exception){
            return "Not found";
        }
    }
    public String deleteCountry(Integer id){
        try{
            CountryModel country = this.countries.stream().filter(element -> id.equals(element.getId())).findFirst().orElse(null);
            if (country == null){
                return "Country not found";
            }
            this.countries.remove(country);
            return "Country deleted";
        }catch (Exception exception){
            return "Not found";
        }
    }




}
