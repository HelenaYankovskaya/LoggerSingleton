package LoggSingl;

import java.io.IOException;
import java.util.logging.FileHandler;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {                   // Задание 6 РТ2 стр 24

        Logger log = Logger.getLogger(SingletonLogger.class.getName());

        FileHandler fh = null;
        try {
            fh = new FileHandler("./LogApp1");
        } catch (IOException e) {
            e.printStackTrace();
        }
        log.addHandler(fh);

      SingletonLogger singletonLogger = new SingletonLogger();
      singletonLogger.someMethod();

    }
}
