package by.itstep.goutor.jaavaexam.model.logic;

import by.itstep.goutor.jaavaexam.model.entity.Car;
import by.itstep.goutor.jaavaexam.model.entity.Transport;
import by.itstep.goutor.jaavaexam.model.entity.TransportStation;

public class CarManager {
    public static double getTotalPrice(TransportStation station) {
        double total = 0;
        if (station.getList() instanceof Car) {
            for (Transport car : station.getList()) {
                total += car.getPrice();
            }
        }

        return total;
    }
}
