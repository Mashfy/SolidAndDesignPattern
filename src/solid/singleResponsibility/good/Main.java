package solid.singleResponsibility.good;


public class Main {
    public static void main(String[] args) {
        Car car = new Car(80); // fuel 50L added

        car.accelerate(); // fuel burning
        car.accelerate(); // fuel burning
        car.accelerate(); // fuel burning
        car.accelerate(); // fuel burning
        car.accelerate(); // fuel burning

        System.out.println(car.getRemainingFuel());

        FuelPump fuelPump = new FuelPump();
        fuelPump.reFuel(car);
        System.out.println(car.getRemainingFuel());
    }
}
