package solid.singleResponsibility.bad;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(50); // fuel 50L added

        car.accelerate(); // fuel burning
        System.out.println(car.getRemainingFuel());
        car.reFuel(); // refuel
        System.out.println(car.getRemainingFuel());
    }
}
