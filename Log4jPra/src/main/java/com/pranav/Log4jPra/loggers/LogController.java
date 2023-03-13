package com.pranav.Log4jPra.loggers;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LogController {
    static Logger logger= LogManager.getLogger(LogController.class);

    @GetMapping("pranav")
    public String test()
    {
        logger.info("This info on web");
        return "Hello from Pranav Shivam";
    }
}
