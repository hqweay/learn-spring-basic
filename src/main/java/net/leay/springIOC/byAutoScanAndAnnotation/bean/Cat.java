package net.leay.springIOC.byAutoScanAndAnnotation.bean;

import org.springframework.context.annotation.Bean;

/**
 * @description: 定义一个没有构造器的 bean；
 * @author hengqw
 */
public class Cat {

//  若加上这个，会覆盖下面的 Bean 的值
//  @Value("en?")
  private String name;
  private String age;

  public String getName() {
    return name;
  }

  public Cat() {
  }

  @Bean(value = "duyong")
  public Cat getDuYong() {
    Cat cat = new Cat();
    cat.name = "duyong";
    return cat;
  }

  @Bean(value = "wenyi")
  public Cat getWenYi() {
    Cat cat = new Cat();
    cat.name = "wenyi";
    return cat;
  }
}
