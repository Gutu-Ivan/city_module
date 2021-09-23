package dev.gutuivan.model;

public class CountryModel {
    private Integer id = null;
    private String name = null;
    private static Integer autoincrementId = 0;

    public CountryModel(String countryName) {
        CountryModel.autoincrementId++;
        this.id = CountryModel.autoincrementId;
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
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
