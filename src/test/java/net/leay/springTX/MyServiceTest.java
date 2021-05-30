package net.leay.springTX;

import net.leay.springIOC.byConstructor.bean.Cat;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import static org.junit.Assert.*;

/**
 * @author hqweay
 * @Description: TODO
 * @date 5/30/21 11:42 AM
 */
public class MyServiceTest {

	@Test
	public void register() throws NoSuchFieldException {
		BeanFactory factory = new ClassPathXmlApplicationContext("springTX/bean.xml");
		MyService myService = (MyService) factory.getBean("myService");
		myService.register();
	}

	@Test
	public void register2() throws NoSuchFieldException {
		BeanFactory factory = new ClassPathXmlApplicationContext("springTX/bean.xml");
		MyService myService = (MyService) factory.getBean("myService");
		DataSourceTransactionManager transactionManager = (DataSourceTransactionManager) factory.getBean("transactionManager");

		// 开始事务
		TransactionStatus status = transactionManager.getTransaction(new DefaultTransactionDefinition());

		try {
			// 进行需要处在同一事务中的数据库操作
			myService.register2();
			// 正常结束，提交事务
			transactionManager.commit(status);
		} catch (NoSuchFieldException e) {
			// 错误处理
			// 回滚
			transactionManager.rollback(status);
		}


		myService.register();
	}
}