package net.leay.springIOC.byAnnotation;

import net.leay.springIOC.byAnnotation.bean.Car;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hengqw
 */
public class OhFactory {

  @Test
  public void testOne(){
    BeanFactory factory = new ClassPathXmlApplicationContext("springIOC/beanByAnnotation.xml");
    Car car = (Car) factory.getBean("car");
    System.out.println(car.getName() + " " + car.getWheel().getName());
  }
}
