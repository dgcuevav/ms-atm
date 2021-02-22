package com.inteligo.atm.model.api.locator;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@ToString
public class Atm implements Comparable<Atm>{

    private Address address;
    private float distance;
    private String type;

    @Override
    public int compareTo(Atm o) {
        return this.address.compareTo(o.address);
    }

}
