package com.springboot.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.model.EventData;
import com.springboot.thirdparty.EventStorage;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

  @Autowired
  private EventStorage eventStorage;

  public List<EventData> getEventList() throws JsonProcessingException {
    String expected = eventStorage.getEventStorage();
    ObjectMapper objectMapper = new ObjectMapper();
    List<EventData> list = objectMapper.readValue(expected, new TypeReference<List<EventData>>() {});
    return list;
  }
}
