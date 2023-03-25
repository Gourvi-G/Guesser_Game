import java.util.Scanner;
class calc1 implements Runnable{
    public void run(){
        System.out.println("Calculation.........");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scan.nextInt();
        System.out.println("Enter second number...");
        int b=scan.nextInt();
        System.out.println("Result");
        int res=a+b;
        System.out.println(res);
    }
}

class impMsg1 implements Runnable {
    public void run() {
        System.out.println("Displaying Important message started");
        try {
            for (int i = 0; i < 2; i++) {
                System.out.println("Focus is important");
                Thread.sleep(2000);
            }
            System.out.println("Displaying Important message ended");
        } catch (Exception e) {
            System.out.println("some problem...");
        }
    }
}
public class Launch4 {
    public static void main(String[] args) {


        calc1 c1 = new calc1();
        impMsg1 m1 = new impMsg1();
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(m1);
        t1.start();
        t2.start();

    }
}

