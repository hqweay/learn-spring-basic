package net.leay.myAOP.byProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author hengqw
 */
public class MyHandler implements InvocationHandler {
  private Coder coder;

  public MyHandler() {
  }

  public MyHandler(Coder coder) {
    this.coder = coder;
  }

  @Override
  public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
    System.out.println("先打开我的电脑");
    Object invoke = method.invoke(coder, objects);
    return invoke;
  }

  public static void main(String[] args) {
    String ll = null;
    System.out.println(ll.trim());
  }

}
