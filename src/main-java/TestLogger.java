import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class TestLogger {

    static Logger logger = Logger.getLogger(TestLogger.class);

    public TestLogger(){
        DOMConfigurator.configure("log4j.xml");
    }
    public void info(String message){
        logger.info(message);
    }
    public void warn(String message){
        logger.warn(message);
    }
    public void error(String message){
        logger.error(message);
    }
}
