package com.thoughtworks.springboot.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
class HelloWorldControllerTest {

  @InjectMocks
  private HelloWorldController helloWorldController;

  @Test
  void should_return_status_code_200_when_call_get_hello_world_api() {
    ResponseEntity<String> responseEntity = helloWorldController.getHelloWorld();

    assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
  }

  @Test
  void should_return_HelloWorld_when_call_get_hello_world_api() {
    ResponseEntity<String> responseEntity = helloWorldController.getHelloWorld();

    assertEquals("Hello World.", responseEntity.getBody());
  }
}
