package com.inteligo.atm.service;

import com.inteligo.atm.model.dto.AtmLocationResponse;
import reactor.core.publisher.Flux;

public interface AtmService {

  Flux<AtmLocationResponse> getAtms();
}
