package com.inteligo.atm.controller;

import com.inteligo.atm.model.dto.AtmLocationResponse;
import com.inteligo.atm.service.AtmService;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/atm")
@RequiredArgsConstructor
public class AtmController {

  private static final Logger log = LoggerFactory.getLogger(AtmController.class);

  private final AtmService atmService;

  @GetMapping
  public Flux<AtmLocationResponse> getAtmLocations() {
    return atmService.getAtms();
  }

}
