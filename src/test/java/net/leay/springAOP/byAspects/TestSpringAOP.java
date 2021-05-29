package net.leay.springAOP.byAspects;

import net.leay.springAOP.aspects.Coder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hengqw
 */
public class TestSpringAOP {
  @Test
  public void test(){
    ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("springAOP/aspects/aop.xml");
    Coder coder = (Coder) applicationContext.getBean("coder");
    coder.work();
  }
}
