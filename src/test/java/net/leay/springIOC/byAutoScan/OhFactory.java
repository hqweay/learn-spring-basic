package net.leay.springIOC.byAutoScan;

import net.leay.springIOC.byAutoScan.bean.Cat;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hengqw
 */
public class OhFactory {
  @Test
  public void testOne(){
    BeanFactory factory = new ClassPathXmlApplicationContext("springIOC/beanByAutoScan.xml");
    Cat cat = (Cat) factory.getBean("yo");
    System.out.println(cat.getName());
  }
}
