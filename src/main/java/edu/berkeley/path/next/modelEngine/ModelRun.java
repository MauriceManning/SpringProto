package edu.berkeley.path.next.modelEngine;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This service is launched to complete  a single execution of the model framework.
 * For this prototype it simply persists a single link data object to the repository
 */

public class ModelRun {

    /**
     * Autowired annotation denotes member to be conncted by Spring's dependency injection
     * facilities Fields are injected right after construction of a bean, before any
     * config methods are invoked.
     */
    @Autowired
    ChannelController channel;


    public void runModel()   {
        final Logger logger = LogManager.getLogger(ModelRun.class.getName());

        logger.info("ModelRun: run the model ");
        channel.addLinkData();

    }

}
