package net.leay.springIOC.byConstructor.bean;

/**
 * @description: 构造器注入
 * @author hengqw
 */
public class Cat {
  private String name;
  private String age;

  public Cat() {
  }

  public Cat(String name, String age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String getAge() {
    return age;
  }
}
