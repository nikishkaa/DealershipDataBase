package by.itstep.goutor.jaavaexam.model.logic;

import by.itstep.goutor.jaavaexam.model.entity.Car;
import by.itstep.goutor.jaavaexam.model.entity.CarStation;

public class CarManager {
    public static double getTotalPrice(CarStation station) {
        double total = 0;
        for (Car car : station.getList()) {
            total += car.getPrice();
        }

        return total;
    }
}
