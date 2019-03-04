package com.ippon.k8s.client.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

  private RestTemplate restTemplate;

  private static Logger logger = LoggerFactory.getLogger(Controller.class);

  @Value("${server.url}")
  private String serverUrl;

  public Controller(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @GetMapping
  public String callDemo() {
    logger.info("Calling Demo url => {}", serverUrl);
    return restTemplate.getForObject(serverUrl, String.class);
  }
}
