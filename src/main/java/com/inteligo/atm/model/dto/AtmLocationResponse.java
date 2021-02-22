package com.inteligo.atm.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class AtmLocationResponse {

  private final String street;
  private final String houseNumber;
  private final String postalCode;
  private final String city;
  private final float latitude;
  private final float longitude;

}
