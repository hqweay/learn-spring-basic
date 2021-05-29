package net.leay.springIOC.byAutoScanAndAnnotation;

import net.leay.springIOC.byAutoScanAndAnnotation.bean.Cat;
import net.leay.springIOC.byAutoScanAndAnnotation.bean.Dog;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author hengqw
 */

public class OhFactory {
  @Test
  public void testCat(){
    ApplicationContext factory = new AnnotationConfigApplicationContext(Cat.class);
    Cat cat = (Cat) factory.getBean("duyong");
    System.out.println(cat.getName());

    Cat cat2 = (Cat) factory.getBean("wenyi");
    System.out.println(cat2.getName());
  }

  @Test
  public void testDog(){
    ApplicationContext dogFactory = new AnnotationConfigApplicationContext(Dog.class);
    Dog dog = (Dog) dogFactory.getBean("xiaoming");
    System.out.println(dog.getName());
  }
}
