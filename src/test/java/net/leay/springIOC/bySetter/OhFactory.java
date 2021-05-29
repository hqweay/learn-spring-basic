package net.leay.springIOC.bySetter;

import net.leay.springIOC.bySetter.bean.Cat;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hengqw
 */
public class OhFactory {
  @Test
  public void testOne(){
    BeanFactory factory = new ClassPathXmlApplicationContext("springIOC/beanBySetter.xml");
    Cat cat = (Cat) factory.getBean("oneCat");
    System.out.println(cat.getName());
  }
}
