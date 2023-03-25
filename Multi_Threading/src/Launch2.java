class child extends Thread{
    public void run(){
        System.out.println("This is run method of child class");
    }

}

public class Launch2 {
    public static void main(String[] args) {
        child ch = new child();
        ch.start();
    }
}
