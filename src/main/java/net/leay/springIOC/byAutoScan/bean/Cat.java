package net.leay.springIOC.byAutoScan.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @description: 定义一个没有构造器的 bean；
 * @author hengqw
 */
@Component("yo")
public class Cat {

  @Value("haha")
  private String name;
  private String age;

  public String getName() {
    return name;
  }
}
