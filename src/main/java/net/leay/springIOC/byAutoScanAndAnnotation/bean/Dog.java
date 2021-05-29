package net.leay.springIOC.byAutoScanAndAnnotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author hengqw
 */
@Component("xiaoming")
public class Dog {
  @Value("xiaoming")
  private String name;

  public String getName() {
    return name;
  }
}
