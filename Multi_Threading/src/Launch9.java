  class Alpha implements Runnable{
    public void run(){
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 3; i++) {
            System.out.println(name);
            Thread.yield();
        }
    }
 }
  class Beta implements Runnable{
      public void run(){
          String name = Thread.currentThread().getName();
          for (int i = 0; i < 3; i++) {
              System.out.println(name);
          }
      }
  }

public class Launch9 {
    public static void main(String[] args) {


        Alpha ap = new Alpha();
        Beta bt = new Beta();
        Thread t1 = new Thread(ap);
        Thread t2 = new Thread(bt);
        t1.start();
        t2.start();

    }
}
