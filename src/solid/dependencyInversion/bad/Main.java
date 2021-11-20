package solid.dependencyInversion.bad;

//Dependency Inversion Principle
//Entities must depend on abstractions, not on concretions. It states that
//the high-level module must not depend on the low-level module,
//but they should depend on abstractions.

public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();

        pilot.increaseSpeed();
        pilot.vehicleState();
        // now if pilot want to drive another vehicle
        // it would be a problem as the pilot class is depended on RacingCar class

    }
}
