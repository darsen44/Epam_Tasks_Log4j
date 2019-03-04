package task1_6;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.trace("This is TRACE message");
        logger.debug("This is DEBUG message");
        logger.info("This is INFO message");
        logger.warn("This is WARN message");
        logger.error("This is ERROR message");
        logger.fatal("This is FATAL message");
    }
}
