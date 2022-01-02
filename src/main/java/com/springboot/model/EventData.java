package com.springboot.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.springboot.domain.Actor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventData {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("type")
  private String type;

  @JsonProperty("actor")
  private Actor actor;

  @Override
  public String toString() {
    return "EventData{" +
        "id='" + id + '\'' +
        ", type='" + type + '\'' +
        ", actor='" + actor + '\'' +
        '}';
  }
}
