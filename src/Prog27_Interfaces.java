interface Bicycle {
    int speed = 10; // Properties in Interface are final

    void applyBrake(int decrement);

    void speedUp(int increment);
}

interface GearBicycle{
    void shiftGearUp();
    void shiftGearDown();
}

class AvonCycle implements Bicycle, GearBicycle {

    @Override
    public void applyBrake(int decrement) {
        System.out.println("Applying Brakes");
    }

    @Override
    public void speedUp(int increment) {
        System.out.println("Speeding Up");
    }

    public void blowHorn() {
        System.out.println("Blow Horn");
    }

    @Override
    public void shiftGearUp() {
        System.out.println("Shifting Gear Up");
    }

    @Override
    public void shiftGearDown() {
        System.out.println("Shifting Gear Down");
    }
}

public class Prog27_Interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.speedUp(1);
        System.out.println(cycle.speed);
        cycle.shiftGearUp();
        cycle.shiftGearUp();
        cycle.shiftGearDown();
    }
}
