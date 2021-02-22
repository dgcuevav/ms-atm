package com.inteligo.atm.connector;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.inteligo.atm.model.api.locator.Atm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import reactor.core.publisher.Flux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Slf4j
@RequiredArgsConstructor
public class AtmLocatorConnectorImpl implements AtmLocatorConnector {

  @Value("${baseurl.locator-atm}")
  private String url;

  private AtmLocatorApiConfiguration atmApiConfiguration;

  @Override
  public Flux<Atm> getAtms() {
    ObjectMapper objectMapper = new ObjectMapper();

    RestTemplate restTemplate = new RestTemplate();
    ResponseEntity<String> result = restTemplate.getForEntity(url, String.class);
    String data = result.getBody().substring(result.getBody().indexOf('['));
    List<Atm> atms = new ArrayList<>();
    try {
      atms = objectMapper.readValue(data, new TypeReference<List<Atm>>(){});

    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }

    return Flux.fromIterable(atms);
  }
}
