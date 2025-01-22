class MyThread1 extends Thread{
    int i = 0;
    @Override
    public void run(){
        while (i <= 10000){
            System.out.println("Thread1 Running");
            ++i;
        }
    }
}

class MyThread2 extends Thread{
    int i = 0;
    @Override
    public void run(){
        while (i <= 10000){
            System.out.println("Thread2 Running");
            ++i;
        }
    }
}

public class Prog33_MultiThreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        t2.start();
    }
}
