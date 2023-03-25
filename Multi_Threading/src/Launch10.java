
class car implements Runnable{
    public void run(){
         try{
             System.out.println(Thread.currentThread().getName()+"Has entered the parking lot ");
             Thread.sleep(2000);
             synchronized (this){
                 System.out.println(Thread.currentThread().getName()+"Got into the car");
                 Thread.sleep(2000);
                 System.out.println(Thread.currentThread().getName() + "Started to come to drive");
                 Thread.sleep(2000);
                 System.out.println(Thread.currentThread().getName()+"Come back and parked the car");
                 Thread.sleep(2000);
             }
         }
         catch(Exception e){
             System.out.println("Error");
         }
    }
}


public class Launch10 {
    public static void main(String[] args) {


        car c = new car();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        Thread t3 = new Thread(c);
        t1.setName("Son1");
        t2.setName("Son2");
        t3.setName("Son3");
        t1.start();
        t2.start();
        t3.start();
    }
}
