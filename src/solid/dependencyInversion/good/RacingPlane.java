package solid.dependencyInversion.good;


public class RacingPlane implements Vehicle{

    private final int maxFuel;
    private int remainingFuel;
    private int power;

    public RacingPlane(final int maxFuel) {
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
        power=power+5;
        remainingFuel=remainingFuel-5;
    }
}