package com.inteligo.atm.mapper;

import com.inteligo.atm.model.api.locator.Atm;
import com.inteligo.atm.model.dto.AtmLocationResponse;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class AtmMapper {

  public static AtmLocationResponse mapToAtmResponse(Atm atm) {

    return AtmLocationResponse.builder()
        .city(atm.getAddress().getCity())
        .street(atm.getAddress().getStreet())
        .houseNumber(atm.getAddress().getHousenumber())
        .postalCode(atm.getAddress().getPostalcode())
        .latitude(atm.getAddress().getGeoLocation().getLat())
        .longitude(atm.getAddress().getGeoLocation().getLng())
        .build();

  }

}
