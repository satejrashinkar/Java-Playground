class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Thread Id : " + this.threadId() + " Thread Name: " + this.getName());
    }
}

public class Prog36_ThreadPriorities {
    public static void main(String[] args) {
        MyThr1 thread1 = new MyThr1("ThreadOne");
        MyThr1 thread2 = new MyThr1("ThreadTwo");
        MyThr1 thread3 = new MyThr1("ThreadThree");
        MyThr1 thread4 = new MyThr1("ThreadFour");
        MyThr1 thread5 = new MyThr1("ThreadFive");

        thread5.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
