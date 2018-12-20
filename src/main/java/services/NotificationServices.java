package services;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.io.Console;

@Service // declare this class as service
public class NotificationServices {
    private static Logger logger = LogManager.getRootLogger();

    public NotificationServices(){
        logger.info("created notify service");
    }

    public String send(String msg){
        logger.info("send message");
        return msg;
    }

    @Override
    public String toString() {
        logger.info("notify to string");
        final String s = "Notify Services";
        return s;
    }
}
