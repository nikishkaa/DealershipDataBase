package by.itstep.goutor.jaavaexam.model.entity;

public class Transport {
    private String brand;
    private double price;

    public Transport() {
    }

    public Transport(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "brand = " + brand +
                        ", price = " + price;
    }
}
