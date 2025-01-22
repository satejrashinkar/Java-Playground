interface MyCamera1 {
    void takeSnap();

    void recordVideo();

    private void greet() {
        System.out.println("Good Morning");
    }

    default void record4KVideo() {
        greet();
        System.out.println("Recording in 4K");
    }
}

interface MyWiFi1 {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone1 {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting");
    }
}

class MySmartPhone1 extends MyCellPhone1 implements MyWiFi1, MyCamera1 {

    @Override
    public void takeSnap() {
        System.out.println("Taking Snap");
    }

    @Override
    public void recordVideo() {
        System.out.println("Recording Video");
    }

    @Override
    public void record4KVideo() {
        System.out.println("Recording Video in 4K");
    }

    @Override
    public String[] getNetworks() {
        String[] networkList = {"Network1", "Network2", "Network3", "Network4"};
        return networkList;
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class Prog30_Polymorphism {
    public static void main(String[] args) {
        MyCamera1 camera = new MySmartPhone1(); // Indicates - This is a SmartPhone, but use it as a Camera
        // camera.getNetworks();   // Error - Only MyCamera1 methods can be called
        camera.recordVideo();
        camera.record4KVideo();

        MySmartPhone1 smartPhone1 = new MySmartPhone1();    // all the methods of Camera, Wi-Fi and SmartPhone can be called
        String[] networks = smartPhone1.getNetworks();
        for (String network : networks) System.out.println(network);

        smartPhone1.connectToNetwork("Test Network");
        smartPhone1.recordVideo();
        smartPhone1.callNumber(12345);
    }
}
