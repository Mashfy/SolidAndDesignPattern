package solid.dependencyInversion.good;


public class Main {
    public static void main(String[] args) {

        Vehicle car = new RacingCar(100);
        Driver driver = new Driver(car);

        driver.increaseSpeed();
        driver.vehicleState();

        Vehicle plane = new RacingPlane(100);
        driver = new Driver(plane); // driver is now pilot no problem at all

        driver.increaseSpeed();
        driver.vehicleState();


    }
}
