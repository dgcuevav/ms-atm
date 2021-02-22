package com.inteligo.atm.service.impl;

import com.inteligo.atm.connector.AtmLocatorConnector;
import com.inteligo.atm.mapper.AtmMapper;
import com.inteligo.atm.model.dto.AtmLocationResponse;
import com.inteligo.atm.service.AtmService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class AtmImpl implements AtmService {

  private static final Logger log = LoggerFactory.getLogger(AtmImpl.class);
  private final AtmLocatorConnector atmLocatorConnector;

  @Override
  public Flux<AtmLocationResponse> getAtms() {

    return atmLocatorConnector.getAtms()
              .map(AtmMapper::mapToAtmResponse);
  }
}

