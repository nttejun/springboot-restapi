package com.springboot.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.springboot.model.EventData;
import com.springboot.thirdparty.EventStorage;
import com.springboot.utils.JsonParser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

  @Autowired
  private EventStorage eventStorage;

  public List<EventData> getEventList() {
    String expected = eventStorage.getEventStorage();
    return JsonParser.convert(expected, new TypeReference<List<EventData>>() {});
  }
}
