class Demo implements Runnable{
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
public class Launch6 {
    public static void main(String[] args) throws Exception{
        Demo d = new Demo();
        Thread t1 = new Thread(d);
        t1.start();
    }
}
