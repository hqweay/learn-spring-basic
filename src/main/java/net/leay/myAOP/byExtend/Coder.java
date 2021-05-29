package net.leay.myAOP.byExtend;

/**
 * @author hengqw
 */
public class Coder extends Person {
  @Override
  public void work() {
    System.out.println("先喝口水");
    super.work();
  }
}
