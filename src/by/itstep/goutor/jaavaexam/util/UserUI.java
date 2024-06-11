package by.itstep.goutor.jaavaexam.util;

import by.itstep.goutor.jaavaexam.model.entity.Car;

public class UserUI {
    private static StringBuilder BUILDER;

    static {
        BUILDER = new StringBuilder();
    }

    public static String getUserUI(int carCount, Car cheapestCar, Car bestCar, String expensiveBrand) {
        BUILDER.append("\nCar in station: ").append(carCount)
                .append("\nThe cheapest car in station: ").append(cheapestCar)
                .append("\nBest car in station").append(bestCar)
                .append("\nMore expensive brand: ").append(expensiveBrand);


        return BUILDER.toString();
    }
}
