package org.nmx.ehcache.demo.hello.boundary;

import org.nmx.ehcache.demo.hello.control.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class HelloResource {

  @Autowired
  HelloService service;
  
  @GetMapping("/hello")
  public String getHello() {
    return service.getMessage("HELLO")+"\n\r"; 
  }
}
