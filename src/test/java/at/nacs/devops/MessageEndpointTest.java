package at.nacs.devops;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.*;

@SpringBootTest(webEnvironment = RANDOM_PORT)
class MessageEndpointTest {

  @Autowired
  TestRestTemplate restTemplate;

  String url="/";

  @Test
  void get() {
    String actual = restTemplate.getForObject(url, String.class);
    String expected = "Learning DevOps today";
    assertEquals(expected, actual);
  }
}