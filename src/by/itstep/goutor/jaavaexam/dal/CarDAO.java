package by.itstep.goutor.jaavaexam.dal;

import by.itstep.goutor.jaavaexam.model.entity.Car;
import by.itstep.goutor.jaavaexam.model.entity.CarStation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static by.itstep.goutor.jaavaexam.controller.Main.LOGGER;

public class CarDAO {

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/dealer";
    public static final String LOGIN = "root";
    public static final String PASSWORD = "11n11n11n";

    private Connection connection;

    public CarDAO() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
        } catch (ClassNotFoundException | SQLException exception) {
            LOGGER.fatal(exception);
        }
    }

    public CarDAO(Connection connection) {
        this.connection = connection;
    }


    public void add(Car car) {
    }

    public void remove(int id) {

    }

    public Car edi(int id, Car car) {
        return new Car();
    }

    public Car get(int id) {
        return new Car();
    }

    public CarStation getAll() {
        return new CarStation();
    }

    protected void finalize() throws Throwable {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException exception) {
                System.out.println(exception);
            }
        }
    }

}
