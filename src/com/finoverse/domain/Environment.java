package com.finoverse.domain;

/**
 * This class is based Ev table to design
 */

public class Environment {
    private int eid;
    private float temperature;
    private float rh;
    private String property;

    public Environment() {
    }

    public Environment(int eid, float temperature, float rh, String property) {
        this.eid = eid;
        this.temperature = temperature;
        this.rh = rh;
        this.property = property;
    }

    public Environment(float temperature, float rh, String property) {
        this.temperature = temperature;
        this.rh = rh;
        this.property = property;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getRh() {
        return rh;
    }

    public void setRh(float rh) {
        this.rh = rh;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public String toString() {
        return "Environment{" +
                "eid=" + eid +
                ", temperature=" + temperature +
                ", rh=" + rh +
                ", property='" + property + '\'' +
                '}';
    }
}
