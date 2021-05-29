package net.leay.springIOC.byAnnotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @description: 构造器注入
 * @author hengqw
 */
public class Car {
  private String name;
  @Autowired
  @Qualifier("wheelOne")
  private Wheel wheel;

  public String getName() {
    return name;
  }

  public Wheel getWheel() {
    return wheel;
  }

}
