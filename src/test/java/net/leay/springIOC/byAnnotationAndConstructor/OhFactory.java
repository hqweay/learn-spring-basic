package net.leay.springIOC.byAnnotationAndConstructor;

import net.leay.springIOC.byAnnotationAndConstructor.bean.Car;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hengqw
 */
public class OhFactory {
  @Test
  public void testOne(){
    BeanFactory factory = new ClassPathXmlApplicationContext("springIOC/beanByAnnotationAndConstructor.xml");
    Car car = (Car) factory.getBean("car");
    System.out.println(car.getName() + " " + car.getWheel().getName());
  }
}
