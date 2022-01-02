package com.springboot.exception;

public class JsonParseException extends RuntimeException {

  public JsonParseException() {
    super("올바르지 않은 데이터 형식으로 파싱에 실패하였습니다.");
  }

  public JsonParseException(String message) {
    super(message);
  }
}
