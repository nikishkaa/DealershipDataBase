package by.itstep.goutor.jaavaexam.model.entity;

public class Car extends Transport {

    private String model;
    private int year;
    private String country;


    public Car() {
    }

    public Car(String brand, double price, String model, int year, String country) {
        super(brand, price);
        this.model = model;
        this.year = year;
        this.country = country;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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
        return "Car{" + super.toString() +
                ", model = " + model +
                ", year = " + year +
                ", country = " + country + '}';
    }
}
