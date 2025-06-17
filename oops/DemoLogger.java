import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DemoLogger {
    private static final Logger logger = Logger.getLogger(DemoLogger.class.getName());
    public static void main(String[] args){
        logger.setLevel(Level.FINE);
        // Update all handlers (especially the console one)
        for (Handler handler : Logger.getLogger("").getHandlers()) {
            handler.setLevel(Level.FINE);
        }
        logger.info("Application started");
        int x = 5;
        int y = 0;

        try{
            int result = x / y;
        } catch (ArithmeticException e){
            logger.log(Level.SEVERE, "Division by zero error", e);
        }

        logger.warning("This is a warning message");
        logger.fine("This is a debug-level message (may not show by default)");
        logger.info("Application ending");
    }
}
