package LoggSingl;

import java.util.logging.Logger;

public class SingletonLogger {

    private static Logger log = Logger.getLogger(SingletonLogger.class.getName());

    public void someMethod()
    {
        log.info("Запись лога с уровнем INFO (информационная}");
        log.warning("Запись лога с уровнем WARNING (Предупреждение)");
        log.severe("Запись лога с уровнем SEVERE (серъёзная ошибка)");

    }


}


