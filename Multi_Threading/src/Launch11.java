class Books implements Runnable {
    final String str1 = "JAVA";
    final String str2 = "C++";
    final String str3 = "Python";

    public void run() {


        String name = Thread.currentThread().getName();
        if (name.equals("Student1")) {
            try {
                Thread.sleep(3000);
                synchronized (str1) {
                    System.out.println("Student1 has res " + str1);
                    Thread.sleep(3000);
                    synchronized (str2) {
                        System.out.println("Student1 has res " + str2);
                        Thread.sleep(3000);
                        synchronized (str3) {
                            System.out.println("Student1 has res " + str3);
                        }
                    }
                }
            } catch (Exception e) {
                System.out.println("Something Went wrong......");
            }
        } else {

            try {
                Thread.sleep(3000);

                synchronized (str1) {
                    System.out.println("Student2 has res " + str1);
                    Thread.sleep(3000);
                    synchronized (str2) {
                        System.out.println("Student2 has res " + str2);
                        Thread.sleep(3000);
                    }
                    synchronized (str3) {
                        System.out.println("Student2 has res " + str3);
                        Thread.sleep(3000);
                    }
                }

            } catch (Exception e) {
                System.out.println("Something went wrong");
            }
        }
    }
}



public class Launch11 {
    public static void main(String[] args) {
        Books bk=new Books();
        Thread t1=new Thread(bk);
        Thread t2=new Thread(bk);
        t1.setName("Student1");
        t2.setName("Student2");
        t1.start();
        t2.start();
    }
}

