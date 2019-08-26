package org.nmx.ehcache.demo.hello.control;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

  @Cacheable("myCache")
  public String getMessage(String entry) {
    System.out.println("Call the service !");
    return "Hello from spring " + System.currentTimeMillis(); 
  }
}
