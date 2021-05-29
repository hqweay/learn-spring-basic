package net.leay.springAOP.bySpring;

import net.leay.springAOP.spring.Job;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hengqw
 */
public class TestSpringAOP {

  @Test
  public void testIndexOfMethods() {
    ApplicationContext context = new ClassPathXmlApplicationContext("springAOP/spring/aop.xml");
    Job coder = (Job) context.getBean("strongCoder");
    coder.work();
  }
}
