package com.inteligo.atm.model.api.locator;


import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Address implements Comparable<Address> {

    private String street;
    private String housenumber;
    private String postalcode;
    private String city;
    private GeoLocation geoLocation;

    @Override
    public int compareTo(Address o) {
        return this.housenumber.compareTo(o.housenumber);
    }
}
