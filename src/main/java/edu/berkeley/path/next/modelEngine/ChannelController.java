package edu.berkeley.path.next.modelEngine;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * This class represents a connection to a repository. When the addLinkData method
 * is called by the model runner service it creates a link data object and
 * persists it in the repository.
 */


public class ChannelController {


    /**
     * Autowired annotation denotes member to be conncted by Spring's dependency injection
     * facilities Fields are injected right after construction of a bean, before any
     * config methods are invoked.
     */
    @Autowired
    private DBChannel repository;

    public String addLinkData() {
        LinkData linkData = new LinkData();
        linkData.setCapacity(1);
        linkData.setLinkid(2);
        linkData.setNetworkid(3);
        linkData.setRunid(4);
        linkData.setSpeed(5);
        linkData.setVehiclecount(6);

        repository.storeLinkData(linkData);

        return "/result.jsp";
    }

}
