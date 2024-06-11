package by.itstep.goutor.jaavaexam.model.entity;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarStation implements Iterable {
    private List<Car> list;

    public CarStation() {
        list = new ArrayList<>();
    }

    public CarStation(List<Car> list) {
        this.list = list;
    }

    public List<Car> getList() {
        return list;
    }

    public void setList(List<Car> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("List of car:");
        for (Car car : list) {
            builder.append("\n").append(car);
        }

        return builder.toString();
    }

    @Override
    public Iterator iterator() {
        return null;
    }
}
