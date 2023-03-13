package com.pranav.Log4jPra;

import com.pranav.Log4jPra.loggers.LogController;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jPraApplication {
	static Logger logger= LogManager.getLogger(Log4jPraApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(Log4jPraApplication.class, args);
		System.out.println("Hello .........");

		//Trace>>Debug>Info>>warn>>error>Fatal
		logger.trace("This message is from trace messenger");
		logger.debug("This message is from debug messenger");
		logger.info("This message is from info messenger");
		logger.warn("This message is from warn messenger");
		logger.error("This message is from error messenger");
		logger.fatal("This message is from fatal messenger");
	}

}
