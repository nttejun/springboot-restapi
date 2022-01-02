package com.springboot.utils;

import com.google.gson.JsonArray;
import com.springboot.exception.JsonParseException;
import lombok.extern.slf4j.Slf4j;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

@Slf4j
public class JsonParser {

  public static JsonArray toArray(String jsonString) {
  JSONParser jsonParser = new JSONParser();
    try {
      return (JsonArray) jsonParser.parse(jsonString);
    } catch (ParseException e) {
      log.error("[ERROR][JSON][PARSE] - Can't parse : {}", jsonParser);
      throw new JsonParseException();
    } catch (Exception e) {
      log.error("[ERROR][JSON][ETC] - Can't parse : {}", jsonParser);
      throw new JsonParseException();
    }
  }
}
