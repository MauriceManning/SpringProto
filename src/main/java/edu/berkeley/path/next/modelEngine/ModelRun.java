package edu.berkeley.path.next.modelEngine;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ModelRun {

    @Autowired
    ChannelController channel;


    public void runModel()   {
        final Logger logger = LogManager.getLogger(ModelRun.class.getName());

        logger.info("ModelRun: run the model ");
        channel.addLinkData();

    }

}
