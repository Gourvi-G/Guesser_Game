class Demo1 implements Runnable{
    public void run(){
        System.out.println("Sleep Method");
        try{
            System.out.println("Focus is important");
            Thread.sleep(3000);
        }
        catch (Exception e){
            System.out.println("Error");
        }
        System.out.println("Sleep method ended......");
    }

}
public class Launch7{
    public static void main(String[] args) throws Exception{
        Demo1 d = new Demo1();
        Thread t1 = new Thread(d);
        System.out.println(t1.isAlive());
        t1.start();

        System.out.println(t1.isAlive());
        t1.join();
    }
}

