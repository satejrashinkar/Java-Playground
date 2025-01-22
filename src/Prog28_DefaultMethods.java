interface MyCamera {
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

interface MyWiFi {
    String[] getNetworks();

    void connectToNetwork(String network);
}

class MyCellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall() {
        System.out.println("Connecting");
    }
}

class MySmartPhone extends MyCellPhone implements MyWiFi, MyCamera {

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

public class Prog28_DefaultMethods {
    public static void main(String[] args) {
        MySmartPhone smartPhone = new MySmartPhone();
        String[] networks = smartPhone.getNetworks();
        for (String network : networks) System.out.println(network);
        smartPhone.record4KVideo();
    }
}
