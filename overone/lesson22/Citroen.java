package by.overone.lesson22;

import java.util.Objects;

public class Citroen extends Car {
    String brand = "Citroen";
    String model = "C5 Aircross";
    String color = "White";
    int yearOfCarProduction = 2021;

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getYearOfCarProduction() {
        return yearOfCarProduction;
    }

    @Override
    public void setYearOfCarProduction(int yearOfCarProduction) {
        this.yearOfCarProduction = yearOfCarProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Citroen)) return false;
        if (!super.equals(o)) return false;
        Citroen citroen = (Citroen) o;
        return yearOfCarProduction == citroen.yearOfCarProduction && Objects.equals(brand, citroen.brand) && Objects.equals(model, citroen.model) && Objects.equals(color, citroen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand, model, color, yearOfCarProduction);
    }

    @Override
    public String toString() {
        return "Car brand is '" + brand + '\'' +
                ", model '" + model + '\'' +
                ", color '" + color + '\'' +
                ", Year of car production " + yearOfCarProduction;
    }
}
