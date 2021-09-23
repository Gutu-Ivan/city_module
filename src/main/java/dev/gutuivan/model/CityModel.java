package dev.gutuivan.model;

public class CityModel {
    private Integer id = null;
    private String name = null;
    private static Integer autoincrementId = 0;


    public CityModel(String cityName) {
        CityModel.autoincrementId++;
        this.id = CityModel.autoincrementId;
        this.name = name;
    }


    public Integer getId() {
        return id;
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

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
