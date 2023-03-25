
public class Launch1 {
        public static void main(String[] args) {
            System.out.println("Main Program....");
            System.out.println("Before changing");
            String name=Thread.currentThread().getName();
            System.out.println("Name of current thread "+name);
            System.out.println("Priority of current thread is "+ Thread.currentThread().getPriority());

            System.out.println("After changing");
            Thread t = Thread.currentThread();
            t.setName("NewThread");
            t.setPriority(1);
            String name2=Thread.currentThread().getName();
            System.out.println("Name of current thread is "+ name2);
            System.out.println("Priority of current thread is "+ Thread.currentThread().getPriority());
        }
    }


