package com.springboot.api.controller;

import com.springboot.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class EventController {

  @Autowired
  EventService eventService;

  @GetMapping(value = "/api/v1/events")
  public String getEventList(@RequestBody String requestBody) {
    return eventService.getEventList(requestBody);
  }
}
