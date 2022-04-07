package com.AndrewPinner.insight2profittest.model;

import java.util.Collections;

//Object to organize response data from geocoding api after deserializing
public class Coordinates {
    private double x;
    private double y;

    public Coordinates() {

    }

    public Coordinates(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
