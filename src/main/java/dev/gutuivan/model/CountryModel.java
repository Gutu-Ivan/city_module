package dev.gutuivan.model;

import dev.gutuivan.controller.CityController;

public class CountryModel {
    private Integer id = null;
    private String name = null;
    private Integer cityId = null;
    private static Integer autoincrementId = 0;
    private CityController cityRepository;

    public CountryModel(String name, Integer cityId) {
        CountryModel.autoincrementId++;
        this.id = CountryModel.autoincrementId;
        this.name = name;
        this.cityId = cityId;
    }


    public Integer getId() {
        return id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityName(){
        return this.cityRepository.readCity(cityId);
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cityId=" + cityId +
                ", cityName=" + this.getCityName() +
                '}';
    }
}