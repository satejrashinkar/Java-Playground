class MyThreadRunnable1 implements Runnable {
    int i = 0;

    @Override
    public void run() {
        while (i <= 10000) {
            System.out.println("Run method in MyThreadRunnable1");
            ++i;
        }
    }
}

class MyThreadRunnable2 implements Runnable {
    int i = 0;

    @Override
    public void run() {
        while (i <= 10000) {
            System.out.println("Run method in MyThreadRunnable2");
            ++i;
        }
    }
}

public class Prog34_Runnable {
    public static void main(String[] args) {
        MyThreadRunnable1 runnable1 = new MyThreadRunnable1();
        Thread t1 = new Thread(runnable1);
        MyThreadRunnable2 runnable2 = new MyThreadRunnable2();
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();
    }
}
