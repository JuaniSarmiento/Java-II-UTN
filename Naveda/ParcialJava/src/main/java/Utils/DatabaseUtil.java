package Utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase utilitaria para obtener conexiones a la base de datos.
 */
public class DatabaseUtil {
    private static final Logger logger = LogManager.getLogger(DatabaseUtil.class);

    private static final String URL = "jdbc:mysql://localhost:3306/escuela?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "";

    public static Connection getConnection() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            logger.info("Conexión exitosa a la base de datos.");
            return conn;
        } catch (SQLException e) {
            logger.error("Error al conectar con la base de datos", e);
            throw new RuntimeException("No se pudo establecer conexión con la base de datos.");
        }
    }

    public static void cerrarPool() {
    }
}
