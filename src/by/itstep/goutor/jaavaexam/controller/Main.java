package by.itstep.goutor.jaavaexam.controller;

import by.itstep.goutor.jaavaexam.dal.CarDAO;
import by.itstep.goutor.jaavaexam.model.entity.Car;
import by.itstep.goutor.jaavaexam.model.entity.TransportStation;
import by.itstep.goutor.jaavaexam.util.UserUI;
import by.itstep.goutor.jaavaexam.view.Printer;
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


//         getAll test
        TransportStation station = carDAO.getAll();
        System.out.println(station);

        // remove car test
//        carDAO.remove(13);
//        station = carDAO.getAll();
//        System.out.println(station);

        // get car by id test
//        Car car = carDAO.get(9);
//      Printer.print(car.toString());

//         add car test
//        Car car = new Car("test", 123, "123", 123, "dsf");
//        TransportStation station = carDAO.getAll();
//        carDAO.add(car);
//        station = carDAO.getAll();
//        Printer.print(station.toString());


        // Business logic test
        int count = carDAO.getCarCountInStation();
        Car cheapestCar = carDAO.getCheapestCarInStation();
        Car bestCar = carDAO.getBestCarInStation();
        String expensiveBrand = carDAO.getMoreExpensiveBrand();

        Printer.print(UserUI.getUserUI(count, cheapestCar, bestCar, expensiveBrand));
    }
}
