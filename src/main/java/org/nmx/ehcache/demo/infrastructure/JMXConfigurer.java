package org.nmx.ehcache.demo.infrastructure;


import javax.management.MBeanServer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.management.ManagementService;

@Service
public class JMXConfigurer {
  private final MBeanServer mBeanServer;

  private final CacheManager cacheManager;

  @Autowired
  public JMXConfigurer(MBeanServer mBeanServer,
      CacheManager cacheManager) {
    this.mBeanServer = mBeanServer;
    this.cacheManager = cacheManager;
  }

  @Bean(initMethod = "init", destroyMethod = "dispose")
  public ManagementService ehCacheManagementService() {
    return new ManagementService(cacheManager, mBeanServer, true, true, true, true, true);

  }
}
