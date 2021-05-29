package net.leay.springIOC.byConstructor;

import net.leay.springIOC.byConstructor.bean.Cat;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hengqw
 */
public class OhFactory {
  @Test
  public void testOne(){
    BeanFactory factory = new ClassPathXmlApplicationContext("springIOC/beanByConstructor.xml");
    Cat cat = (Cat) factory.getBean("oneCat");
    System.out.println(cat.getName());
  }
}
