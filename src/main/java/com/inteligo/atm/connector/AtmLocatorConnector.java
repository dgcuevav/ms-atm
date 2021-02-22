package com.inteligo.atm.connector;

import com.inteligo.atm.model.api.locator.Atm;
import reactor.core.publisher.Flux;

public interface AtmLocatorConnector {

  Flux<Atm> getAtms();

}
