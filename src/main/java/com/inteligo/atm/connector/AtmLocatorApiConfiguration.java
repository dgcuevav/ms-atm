package com.inteligo.atm.connector;

import retrofit2.Call;
import retrofit2.http.GET;

public interface AtmLocatorApiConfiguration {

  @GET("/api/locator/atms/")
  Call<String> getAllAtm();
}
