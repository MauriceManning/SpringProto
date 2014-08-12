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

package edu.berkeley.path.next.decisionService;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * This application launches the decision service which listens for updates from
 * services such as traffic data processing and the model engine. Currently it is
 * only connected to the traffic data processing.
 */


public class DecisionServiceApp {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("decisionService-subscribe.xml");
        context.start();

    }
}
