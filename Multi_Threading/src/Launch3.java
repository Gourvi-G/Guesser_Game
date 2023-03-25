import java.util.Scanner;
class calc extends Thread{
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

class impMsg extends Thread {
    public void run() {
        System.out.println("Displaying Important mesaage started");
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
public class Launch3

{
    public static void main (String[]args){
        calc t1 = new calc();
        impMsg t2 = new impMsg();
        t1.start();
        t2.start();
    }
}













