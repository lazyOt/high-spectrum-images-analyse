package com.finoverse.domain;
import java.sql.Timestamp;
import java.util.Date;

/**
 * This class is based item table to design
 */

public class Item {
    private int id;
    private Timestamp dateTime;
    private int eid;
    private int cid;
    private double waveLength;
    private String imagePath;
    private String property;

    public Item() {
    }

    public Item(Timestamp dateTime, int eid, int cid, double waveLength, String imagePath, String property) {
        this.dateTime = dateTime;
        this.eid = eid;
        this.cid = cid;
        this.waveLength = waveLength;
        this.imagePath = imagePath;
        this.property = property;
    }


    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", dateTime=" + dateTime +
                ", eid=" + eid +
                ", cid=" + cid +
                ", waveLength=" + waveLength +
                ", imagePath='" + imagePath + '\'' +
                ", property='" + property + '\'' +
                '}';
    }

    public Item(int id, Timestamp dateTime, int eid, int cid, double waveLength, String imagePath, String property) {
        this.id = id;
        this.dateTime = dateTime;
        this.eid = eid;
        this.cid = cid;
        this.waveLength = waveLength;
        this.imagePath = imagePath;
        this.property = property;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public double getWaveLength() {
        return waveLength;
    }

    public void setWaveLength(double waveLength) {
        this.waveLength = waveLength;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }
}