package edu.berkeley.path.next.modelEngine;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by mauricemanning on 8/9/14.
 */
public class ChannelController {


    @Autowired
    private DBChannel channel;

    public String addLinkData() {
        LinkData linkData = new LinkData();
        linkData.setCapacity(1);
        linkData.setLinkid(2);
        linkData.setNetworkid(3);
        linkData.setRunid(4);
        linkData.setSpeed(5);
        linkData.setVehiclecount(6);

        channel.storeLinkData(linkData);

        return "/result.jsp";
    }

}
