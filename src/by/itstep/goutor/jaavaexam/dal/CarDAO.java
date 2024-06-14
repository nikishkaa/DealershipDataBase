package by.itstep.goutor.jaavaexam.dal;

import by.itstep.goutor.jaavaexam.model.entity.Car;
import by.itstep.goutor.jaavaexam.model.entity.CarStation;

import java.sql.*;

import static by.itstep.goutor.jaavaexam.controller.Main.LOGGER;

public class CarDAO extends AbstractDAO implements CarInterface {

    public static final String GET_ALL_SQL = "SELECT * FROM car ORDER BY brand";
    public static final String DELETE_CAR = "DELETE FROM car WHERE idcar = ?";
    public static final String GET_CAR_BY_ID = "SELECT * FROM car WHERE idcar = ";
    public static final String ADD_CAR = "INSERT INTO car (brand, model, price, year, country) values(?, ?, ?, ?, ?)";
    public static final String CAR_COUNTER = "SELECT COUNT(*) as count FROM car";
    public static final String CHEAPEST_CAR = "SELECT * FROM car ORDER BY price ASC LIMIT 1";
    public static final String BEST_CAR = "SELECT * FROM car ORDER BY price DESC LIMIT 1";
    public static final String MORE_EXPENSIVE_BRAND = "SELECT MAX(brand) as 'Total' FROM car";



    public CarDAO() {
        super();
    }

    public CarDAO(Connection connection) {
        super(connection);
    }

    @Override
    public void add(Car car) {
        try {
            PreparedStatement statement = connection.prepareStatement(ADD_CAR);
            statement.setString(1, car.getBrand());
            statement.setString(2, car.getModel());
            statement.setDouble(3, car.getPrice());
            statement.setInt(4, car.getYear());
            statement.setString(5, car.getCountry());
            statement.executeUpdate();
        } catch (SQLException exception) {
            LOGGER.fatal(exception);
        }
    }

    @Override
    public void remove(int id) {
        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_CAR);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException exception) {
            LOGGER.fatal(exception);
        }
    }




    @Override
    public void edit(int id, Car car) {
        remove(id);
        add(car);
    }

    @Override
    public Car get(int id) {
        Car car = new Car();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_CAR_BY_ID + id);
            if (resultSet.next()) {
                car.setBrand(resultSet.getString("brand"));
                car.setModel(resultSet.getString("model"));
                car.setPrice(resultSet.getDouble("price"));
                car.setYear(resultSet.getInt("year"));
                car.setCountry(resultSet.getString("country"));
            }
        } catch (SQLException exception) {
            LOGGER.fatal(exception);
        }

        return car;
    }

    @Override
    public CarStation getAll() {
        CarStation station = new CarStation();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(GET_ALL_SQL);
            while (resultSet.next()) {
                Car car = new Car();
                car.setBrand(resultSet.getString("brand"));
                car.setModel(resultSet.getString("model"));
                car.setPrice(resultSet.getDouble("price"));
                car.setYear(resultSet.getInt("year"));
                car.setCountry(resultSet.getString("country"));

                station.getList().add(car);
            }
        } catch (SQLException exception) {
            LOGGER.fatal(exception);
        }

        return station;
    }

    @Override
    public int getCarCountInStation() {
        int count = 0;
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(CAR_COUNTER);
            if (resultSet.next()) {
                count = resultSet.getInt("count");
            }
        } catch (SQLException exception) {
            LOGGER.fatal(exception);
        }

        return count;
    }

    @Override
    public Car getCheapestCarInStation() {
        Car car = new Car();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(CHEAPEST_CAR);
            if (resultSet.next()) {
                car.setBrand(resultSet.getString("brand"));
                car.setModel(resultSet.getString("model"));
                car.setPrice(resultSet.getDouble("price"));
                car.setYear(resultSet.getInt("year"));
                car.setCountry(resultSet.getString("country"));
            }
        } catch (SQLException exception) {
            LOGGER.fatal(exception);
        }

        return car;
    }

    @Override
    public Car getBestCarInStation() {
        Car car = new Car();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(BEST_CAR);
            if (resultSet.next()) {
                car.setBrand(resultSet.getString("brand"));
                car.setModel(resultSet.getString("model"));
                car.setPrice(resultSet.getDouble("price"));
                car.setYear(resultSet.getInt("year"));
                car.setCountry(resultSet.getString("country"));
            }
        } catch (SQLException exception) {
            LOGGER.fatal(exception);
        }

        return car;
    }

    @Override
    public String getMoreExpensiveBrand() {
        String expensive = "No brand";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(MORE_EXPENSIVE_BRAND);
            if (resultSet.next()) {
                expensive = resultSet.getString("Total");
            }
        } catch (SQLException exception) {
            LOGGER.fatal(exception);
        }

        return expensive;
    }
}