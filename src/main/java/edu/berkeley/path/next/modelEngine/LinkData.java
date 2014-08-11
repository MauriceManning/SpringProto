package edu.berkeley.path.next.modelEngine;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;


@Entity
public class LinkData {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int pid;

    private int  networkid;
    private int  linkid;
    private int  capacity;
    private int  runid;
    private int  vehiclecount;
    private int speed;

    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getNetworkid() {
        return networkid;
    }
    public void setNetworkid(int networkid) {
        this.networkid = networkid;
    }

    public int getLinkid() {
        return linkid;
    }
    public void setLinkid(int linkid) {
        this.linkid = linkid;
    }

    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) { this.capacity = capacity;}

    public int getRunid() {
        return runid;
    }
    public void setRunid(int runid) { this.runid = runid;}

    public int getVehiclecount() {
        return vehiclecount;
    }
    public void setVehiclecount(int vehiclecount) { this.vehiclecount = vehiclecount;}

    public int getSpeed() { return speed; }
    public void setSpeed(int speed) { this.speed = speed; }

    }

