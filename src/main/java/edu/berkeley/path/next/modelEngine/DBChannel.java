package edu.berkeley.path.next.modelEngine;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This class creates a connection to the database. When the storeLinkData method
 * is called it creates a new session, stores the object then closes the session.
 */

public class DBChannel {
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Transactional(readOnly=false)
    public void storeLinkData(LinkData ld) {

        final Logger logger = LogManager.getLogger(DBChannel.class.getName());

        logger.info("DBChannel storeLinkData start)");


        try {
            Session session = sessionFactory.openSession();
            logger.info("DBChannel storeLinkData openSession ");
            Integer id = (Integer) session.save(ld);
            logger.info("DBChannel storeLinkData save id {} ", id);
            session.flush();
            session.close();
        } catch (Exception ex) {
            logger.info("DBChannel storeLinkData Exception ex: {}",  ex.toString());
        }
    }


}
