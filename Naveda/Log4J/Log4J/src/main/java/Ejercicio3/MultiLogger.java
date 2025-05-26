package Ejercicio3;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MultiLogger {
    private static final Logger logger = LogManager.getLogger(MultiLogger.class);

    public static void main(String[] args) {
        logger.info("Mensaje a consola y archivo");
    }
}
