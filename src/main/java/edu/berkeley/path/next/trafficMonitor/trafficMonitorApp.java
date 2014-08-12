/*
 * Copyright 2002-2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.berkeley.path.next.trafficMonitor;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This application models a traffic manager service that publishes traffic status
 * every three seconds. It is decoupled from what services subscribe to that data feed.
 */

public class trafficMonitorApp {

    public static void main(String[] args) throws InterruptedException {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("jms-publish.xml");
        context.start();

        final Logger logger = LogManager.getLogger(trafficMonitorApp.class.getName());

        logger.info("trafficMonitorApp initialized ");

        JmsPublish jmsPublish = context.getBean(JmsPublish.class);

        int x = 0;
        String msg = "status";
        while (x < 7) {
            logger.info("trafficMonitorApp sendTrafficUpdate ");
            jmsPublish.sendTrafficUpdate(msg);
            Thread.sleep(3000);
            x++;
        }
    }
}
