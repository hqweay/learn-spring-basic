package net.leay.springTX;

import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author hqweay
 * @Description: TODO
 * @date 5/30/21 11:40 AM
 */
public class MyService {
//	传播等级、隔离级别、为哪些异常回滚事务
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_UNCOMMITTED, rollbackFor = NoSuchFieldException.class)
	public void register() throws NoSuchFieldException {
		System.out.println("查询是否已有该帐号信息");
		System.out.println("步骤一");
		System.out.println("步骤二");
		int type = 1;
		if (type == 1){
			throw new NoSuchFieldException("异常了哦");
		}
		System.out.println("步骤三");
		System.out.println("插入帐号信息");
	}

	public void register2() throws NoSuchFieldException {
		System.out.println("查询是否已有该帐号信息");
		System.out.println("步骤一");
		System.out.println("步骤二");
		int type = 1;
		if (type == 1){
			throw new NoSuchFieldException("异常了哦");
		}
		System.out.println("步骤三");
		System.out.println("插入帐号信息");
	}
}
