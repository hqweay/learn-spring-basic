package net.leay.myAOP.byProxy;

/**
 * @author hengqw
 */
public class Coder implements Job {
  @Override
  public void work() {
    System.out.println("我要工作了哦");
  }
}
