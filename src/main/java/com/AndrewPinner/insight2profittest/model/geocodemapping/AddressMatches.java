package com.AndrewPinner.insight2profittest.model.geocodemapping;

import com.AndrewPinner.insight2profittest.model.Coordinates;


//used to deserialize geocoding API
public class AddressMatches {
    private Coordinates coordinates;

    public AddressMatches() {

    }

    public AddressMatches(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
