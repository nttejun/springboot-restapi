package com.springboot.dto;

import com.springboot.domain.Actor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class ActorDto {

  @Getter
  @Setter
  public static class Response {

    private static final Response EMPTY = Response.builder().build();

    private Long id;
    private String login;

    @Builder
    private Response(Long id, String login) {
      this.id = id;
      this.login = login;
    }

    public static Response of(Actor actor) {
      if (actor == null) {
        return EMPTY;
      }
      return Response.builder()
          .id(actor.getId())
          .login(actor.getLogin())
          .build();
    }
  }
}
