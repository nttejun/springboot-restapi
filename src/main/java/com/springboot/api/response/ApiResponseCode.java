package com.springboot.api.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ApiResponseCode {

  OK("요청이 성공했습니다");

  private final String message;
}
