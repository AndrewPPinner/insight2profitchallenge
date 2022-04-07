package com.AndrewPinner.insight2profittest.model.geocodemapping;

import java.util.List;

//used to deserialize geocoding API
public class Data {
    private List<AddressMatches> addressMatches;


    public Data() {
    }

    public Data(List<AddressMatches> addressMatches) {
        this.addressMatches = addressMatches;
    }

    public List<AddressMatches> getAddressMatches() {
        return addressMatches;
    }

    public void setAddressMatchesList(List<AddressMatches> addressMatches) {
        this.addressMatches = addressMatches;
    }
}
