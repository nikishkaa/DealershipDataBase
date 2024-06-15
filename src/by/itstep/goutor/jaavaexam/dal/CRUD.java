package by.itstep.goutor.jaavaexam.dal;

import by.itstep.goutor.jaavaexam.model.entity.Car;
import by.itstep.goutor.jaavaexam.model.entity.TransportStation;

public interface CRUD {
    void add(Car car);

    void remove(int id);

    void edit(int id, Car car);

    Car get(int id);

    TransportStation getAll();
}
