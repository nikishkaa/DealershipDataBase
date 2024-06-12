package by.itstep.goutor.jaavaexam.dal;

import by.itstep.goutor.jaavaexam.model.entity.Car;
import by.itstep.goutor.jaavaexam.model.entity.CarStation;

public interface ICarDAO {
    void add(Car car);
    void remove(int id);
    void edit(int id, Car car);
    Car get(int id);
    CarStation getAll();
    int getCarCountInStation();
    Car getCheapestCarInStation();
    Car getBestCarInStation();
    String getMoreExpensiveBrand();
}
