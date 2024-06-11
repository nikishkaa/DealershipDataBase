package by.itstep.goutor.jaavaexam.model.entity;

public class Car {
    private String brand;
    private String model;
    private double price;
    private int year;
    private String country;


    public Car() {
    }

    public Car(String brand, String model, double price, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.year = year;
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand = " + brand +
                ", model = " + model +
                ", price = " + price +
                ", year = " + year +
                ", country = " + country + '}';
    }
}
