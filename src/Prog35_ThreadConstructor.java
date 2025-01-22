class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        int i = 10;
        while (i >= 0) {
            System.out.println("Inside run method of MyThr Class");
            i--;
        }
    }
}

public class Prog35_ThreadConstructor {
    public static void main(String[] args) {
        MyThr thread1 = new MyThr("ThreadOne");
        MyThr thread2 = new MyThr("ThreadTwo");
        thread1.start();
        thread2.start();
        System.out.println("Id of thread1 is : " + thread1.threadId());
        System.out.println("Name of thread1 is : " + thread1.getName());
        System.out.println("Id of thread2 is : " + thread2.threadId());
        System.out.println("Name of thread2 is : " + thread2.getName());
    }
}
