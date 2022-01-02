package com.springboot.api.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.springboot.api.response.ApiResponse;
import com.springboot.service.EventService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EventController {

  @Autowired
  EventService eventService;

  @GetMapping(value = "/api/v1/events")
  public ApiResponse<?> getEventList() throws JsonProcessingException {
    return ApiResponse.ok(eventService.getEventList());
  }
}
