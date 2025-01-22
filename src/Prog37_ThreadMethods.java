class MyThr2 extends Thread {
    public void run() {
        while (true){
            System.out.println("MyThr2 Thread Id : " + this.threadId() + " Thread Name: " + this.getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyThr3 extends Thread {
    public void run() {
        System.out.println("MyThr3 Thread Id : " + this.threadId() + " Thread Name: " + this.getName());
    }
}

public class Prog37_ThreadMethods {
    public static void main(String[] args) {
        MyThr2 thread1 = new MyThr2();
        MyThr3 thread2 = new MyThr3();

        thread1.start();
//        try {
//            thread1.join();
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        thread2.start();
    }
}
