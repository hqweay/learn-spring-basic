package net.leay.springIOC.process;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author hqweay
 * @Description: TODO
 * @date 5/30/21 4:15 PM
 */
public class CatTest {
	@Test
	public void testSingleScope(){
		BeanFactory factory = new ClassPathXmlApplicationContext("springIOC/process.xml");
		Cat cat1 = (Cat) factory.getBean("oneCat");
		System.out.println(cat1.getName());

		cat1.setName("duyong");

		Cat cat2 = (Cat) factory.getBean("oneCat");
		System.out.println(cat2.getName());
		((ClassPathXmlApplicationContext) factory).destroy();
	}
}
