package com.springboot.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.springboot.exception.JsonParseException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonParser {

  private static final ObjectMapper objectMapper = new ObjectMapper();

  public static <T> T convert(String from, TypeReference type) {
    try {
      return (T) objectMapper.readValue(from, type);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
      log.error("[ERROR][PARSE][JSON] - Can't parse : {}", from);
      throw new JsonParseException();
    } catch (Exception e) {
      e.printStackTrace();
      log.error("[ERROR][PARSE][ETC] - Can't parse : {}", from);
      throw new JsonParseException();
    }
  }
}
