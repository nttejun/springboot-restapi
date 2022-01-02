package com.springboot.dto;

import com.springboot.domain.Event;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class EventDto {

  @Setter
  @Getter
  public static class Response {
    private Long id;
    private String type;
    private ActorDto.Response actor;

    @Builder
    private Response(Long id, String type, ActorDto.Response actor) {
      this.id = id;
      this.type = type;
      this.actor = actor;
    }

    public static Response of(Event entity) {
      return Response.builder()
          .id(entity.getId())
          .type(entity.getType())
          .actor(ActorDto.Response.of(entity.getActor()))
          .build();
    }
  }
}
