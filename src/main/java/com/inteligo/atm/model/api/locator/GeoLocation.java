package com.inteligo.atm.model.api.locator;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class GeoLocation {
    private float lat;
    private float lng;

}
