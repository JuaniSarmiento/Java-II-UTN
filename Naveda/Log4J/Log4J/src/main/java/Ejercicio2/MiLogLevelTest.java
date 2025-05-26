package Ejercicio2;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MiLogLevelTest {
    private static final Level MI_LOG_LEVEL = Level.forName("MI_LOG_LEVEL", 450);
    private static final Logger logger = LogManager.getLogger(MiLogLevelTest.class);

    public static void main(String[] args) {
        logger.log(MI_LOG_LEVEL, "Este es un mensaje con mi nivel personalizado.");
    }
}
