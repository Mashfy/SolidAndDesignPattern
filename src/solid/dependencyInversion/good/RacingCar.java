package solid.dependencyInversion.good;


public class RacingCar implements Vehicle{

    private final int maxFuel;
    private int remainingFuel;
    private int power;

    public RacingCar(final int maxFuel) {
        this.maxFuel = maxFuel;
        remainingFuel = maxFuel;
    }

    public int getRemainingFuel() {
        return remainingFuel;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public int getPower() {
        return power;
    }


    @Override
    public void accelerate() {
        power++;
        remainingFuel--;
    }
}