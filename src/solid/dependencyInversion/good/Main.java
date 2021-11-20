package solid.dependencyInversion.good;

//Dependency Inversion Principle
//Entities must depend on abstractions, not on concretions. It states that
//the high-level module must not depend on the low-level module,
//but they should depend on abstractions.


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
