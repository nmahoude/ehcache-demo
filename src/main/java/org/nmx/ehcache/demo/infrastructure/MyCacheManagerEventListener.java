package org.nmx.ehcache.demo.infrastructure;

import java.util.Properties;

import net.sf.ehcache.CacheException;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Status;
import net.sf.ehcache.event.CacheManagerEventListener;
import net.sf.ehcache.event.CacheManagerEventListenerFactory;

public class MyCacheManagerEventListener extends CacheManagerEventListenerFactory {
  @Override
  public CacheManagerEventListener createCacheManagerEventListener(CacheManager cacheManager, Properties properties) {
    return new CacheManagerEventListener() {
      @Override
      public void notifyCacheRemoved(String cacheName) {
        System.out.println("This cache is removed : "+cacheName);
      }
      
      @Override
      public void notifyCacheAdded(String cacheName) {
        System.out.println("This cache is added : "+cacheName);
      }
      
      @Override
      public void init() throws CacheException {
        // TODO Auto-generated method stub
        
      }
      
      @Override
      public Status getStatus() {
        // TODO Auto-generated method stub
        return null;
      }
      
      @Override
      public void dispose() throws CacheException {
        // TODO Auto-generated method stub
        
      }

    };
  }
}
