package by.overone.lesson22;

import java.util.Objects;

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private int yearOfCarProduction;

    public Car (){

    }

    public Car(String brand, String model, String color, int year) {
    this.color = color;
    this.yearOfCarProduction = year;
    this.brand = brand;
    this.model = model;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYearOfCarProduction(int yearOfCarProduction) {
        this.yearOfCarProduction = yearOfCarProduction;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfCarProduction() {
        return yearOfCarProduction;

    }

    @Override
    public String toString() {
        return "Car brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfCarProduction=" + yearOfCarProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return yearOfCarProduction == car.yearOfCarProduction && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, yearOfCarProduction);
    }
}
