package net.leay.springAOP.spring;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author hengqw
 */
public class RelaxAspect implements MethodInterceptor {
  @Override
  public Object invoke(MethodInvocation methodInvocation) throws Throwable {
    System.out.println("喝喝水");
    Object returnObj = methodInvocation.proceed();
    System.out.println("上厕所");
    return returnObj;
  }
}
