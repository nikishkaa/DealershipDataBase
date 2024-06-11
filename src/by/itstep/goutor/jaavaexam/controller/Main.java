package by.itstep.goutor.jaavaexam.controller;

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


//        double total = CarManager.getTotalPrice();
//        System.out.println(total);
    }
}
