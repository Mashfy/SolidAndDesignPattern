package solid.dependencyInversion.bad;

public class Main {
    public static void main(String[] args) {
        Pilot pilot = new Pilot();

        pilot.increaseSpeed();
        pilot.vehicleState();
        // now if pilot want to drive another vehicle
        // it would be a problem as the pilot class is depended on RacingCar class

    }
}
