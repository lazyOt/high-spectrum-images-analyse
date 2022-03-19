package com.finoverse.domain;

/**
 * This class is based Cr table to design
 */

public class CulturalRelics {
    private int cid;
    private String property;

    public CulturalRelics() {
    }

    public CulturalRelics(int cid, String property) {
        this.cid = cid;
        this.property = property;
    }
    public CulturalRelics( String property) {
        this.property = property;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getCid() {
        return cid;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getProperty() {
        return property;
    }

    @Override
    public String toString() {
        return "CulturalRelics{" +
                "cid=" + cid +
                ", property='" + property + '\'' +
                '}';
    }
}
