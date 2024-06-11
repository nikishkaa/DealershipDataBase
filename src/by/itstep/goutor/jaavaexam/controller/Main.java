package by.itstep.goutor.jaavaexam.controller;

import by.itstep.goutor.jaavaexam.dal.CarDAO;
import by.itstep.goutor.jaavaexam.model.entity.Car;
import by.itstep.goutor.jaavaexam.model.entity.CarStation;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class Main extends Object {
    public static final Logger LOGGER;

    static {
        LOGGER = Logger.getRootLogger();
    }

    public static void main(String[] args) {
        BasicConfigurator.configure();
        LOGGER.setLevel(Level.ALL);


        CarDAO carDAO = new CarDAO();

        // getAll test
//        CarStation station = carDAO.getAll();
//        System.out.println(station);

        // remove car test
//        carDAO.remove(1);
//        station = carDAO.getAll();
//        System.out.println(station);

        // get car by id test
//        Car car = carDAO.get(2);
//        System.out.println(car);

        // add car test
//        Car car = new Car("777", "123", 123, 123, "dsf");
//        CarStation station = carDAO.getAll();
//        carDAO.add(car);
//        station = carDAO.getAll();
//        System.out.println(station);
    }
}
