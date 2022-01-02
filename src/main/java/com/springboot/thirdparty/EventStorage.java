package com.springboot.thirdparty;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class EventStorage {

  public String getEventStorage() {
    RestTemplate restTemplate = new RestTemplate();
    String eventListUrl = "https://s3.ap-northeast-2.amazonaws.com/bunjang-interview/events.json";
    ResponseEntity<String> response = restTemplate.getForEntity(eventListUrl, String.class);
    return response.getBody();
  }
}
