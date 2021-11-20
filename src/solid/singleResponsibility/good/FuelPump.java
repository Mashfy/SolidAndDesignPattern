package solid.singleResponsibility.good;

public class FuelPump {

    public void reFuel(final Car car) {
        final int remainingFuel = car.getRemainingFuel();
        final int additionalFuel = car.getMaxFuel() - remainingFuel;
        car.setRemainingFuel(remainingFuel + additionalFuel);
    }
}