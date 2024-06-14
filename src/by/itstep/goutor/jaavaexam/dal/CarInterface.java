package by.itstep.goutor.jaavaexam.dal;

import by.itstep.goutor.jaavaexam.model.entity.Car;

public interface CarInterface {
    int getCarCountInStation();

    Car getCheapestCarInStation();

    Car getBestCarInStation();

    String getMoreExpensiveBrand();
}
