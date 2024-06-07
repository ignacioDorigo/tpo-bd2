package aplicacion;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LoggerConfig {

    private static final Logger logger = Logger.getLogger(LoggerConfig.class.getName());

    static {
        System.out.println("Creando el logger");
        try {
            // Configurar FileHandler
            System.out.println("Configurando el FileHandler...");
            String logFilePath = System.getProperty("user.dir") + "/app.log";
            FileHandler fileHandler = new FileHandler(logFilePath, true);
            fileHandler.setFormatter(new SimpleFormatter());
            fileHandler.setLevel(Level.INFO);
            System.out.println("FileHandler configurado.");

            // Configurar ConsoleHandler
            ConsoleHandler consoleHandler = new ConsoleHandler();
            consoleHandler.setFormatter(new SimpleFormatter());
            consoleHandler.setLevel(Level.INFO);

            // Añadir manejadores al Logger
            logger.addHandler(fileHandler);
            logger.addHandler(consoleHandler);

            // Configurar nivel del Logger
            logger.setLevel(Level.INFO);

        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error al configurar el logger", e);
        }
    }

    public static Logger getLogger() {
        return logger;
    }
}

