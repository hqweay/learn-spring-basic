package net.leay.myAOP.byProxy;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyHandlerTest {
  @Test
  public void invoke() {

    InvocationHandler handler = new MyHandler(new Coder());

    Job coderProxy = (Job) Proxy.newProxyInstance(Coder.class.getClassLoader(),
            Coder.class.getInterfaces(),
            handler);

    coderProxy.work();
  }
}