package by.itstep.goutor.jaavaexam.dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static by.itstep.goutor.jaavaexam.controller.Main.LOGGER;

public abstract class AbstractDAO implements CRUD {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/dealer";
    public static final String LOGIN = "root";
    public static final String PASSWORD = "11n11n11n";

    protected Connection connection;

    public AbstractDAO() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
        } catch (ClassNotFoundException | SQLException exception) {
            LOGGER.fatal(exception);
        }
    }

    public AbstractDAO(Connection connection) {
        this.connection = connection;
    }

    protected void finalize() throws Throwable {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException exception) {
                LOGGER.fatal(exception);
            }
        }
    }

}
