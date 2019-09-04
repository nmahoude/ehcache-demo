package org.nmx.ehcache.demo.hello.control;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import net.sf.ehcache.CacheManager;

@Service
public class HelloService {

  public int times =0;
  
  @Cacheable("myCache")
  public String getMessage(String entry) {
    System.out.println("Call the service !");
  
    times++;
    
    if (times == 3) {
      System.out.println("Killing the cache");
      CacheManager.getInstance().removeCache("myCache");
    }
    return "Hello from spring " + System.currentTimeMillis(); 
  }

}
