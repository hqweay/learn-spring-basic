package net.leay.springIOC.process;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

/**
 * @description:
 * @author hengqw
 */
public class Cat implements DisposableBean, InitializingBean, BeanFactoryAware, BeanNameAware {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
    System.out.println("setBeanFactory method of cat is invoked");
  }

  @Override
  public void setBeanName(String name) {
    System.out.println("setBeanName method of cat is invoked");
  }

  public void init() {
    System.out.println("custom init method of cat bean is invoked!");
  }

  //Bean initialization code  equals to
  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("afterPropertiesSet method of cat bean is invoked!");
  }

  //Bean destruction code
  @Override
  public void destroy() throws Exception {
    System.out.println("DisposableBean Destroy method of cat bean is invoked!");
  }

  public void destroyMethod() {
    System.out.println("custom Destroy method of cat bean is invoked!");
  }

}
