package net.leay.springIOC.scope;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CatTest {

  @Test
  public void testSingleScope(){
    BeanFactory factory = new ClassPathXmlApplicationContext("springIOC/scope.xml");
    Cat cat1 = (Cat) factory.getBean("oneCat");
    System.out.println(cat1.getName());

    cat1.setName("duyong");

    Cat cat2 = (Cat) factory.getBean("oneCat");
    System.out.println(cat2.getName());

  }

  @Test
  public void testPrototypeScope(){
    BeanFactory factory = new ClassPathXmlApplicationContext("springIOC/scope.xml");
    Cat cat1 = (Cat) factory.getBean("twoCat");
    System.out.println(cat1.getName());

    cat1.setName("duyong");

    Cat cat2 = (Cat) factory.getBean("twoCat");
    System.out.println(cat2.getName());

  }
}