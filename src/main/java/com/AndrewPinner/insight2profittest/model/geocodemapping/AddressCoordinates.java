package com.AndrewPinner.insight2profittest.model.geocodemapping;


//used to deserialize geocoding API
public class AddressCoordinates {

    private Data result;
    private double xCoordinates;
    private double yCoordinates;


    public Data getResult() {
        return result;
    }

    public void setResult(Data result) {
        this.result = result;
    }

    public double getxCoordinates() {
        return xCoordinates;
    }

    public void setxCoordinates(double xCoordinates) {
        this.xCoordinates = xCoordinates;
    }

    public double getyCoordinates() {
        return yCoordinates;
    }

    public void setyCoordinates(double yCoordinates) {
        this.yCoordinates = yCoordinates;
    }
}




