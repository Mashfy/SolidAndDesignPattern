package solid.dependencyInversion.bad;


public class Pilot {

    private RacingCar vehicle;

    public Pilot() {
        this.vehicle = new RacingCar(100);
    }

    public void increaseSpeed() {
        vehicle.accelerate();
        System.out.println("Acceleration done");


    }
    public void vehicleState(){
        System.out.println("Vehicle state:---- ");
        System.out.println("Max fuel: "+vehicle.getMaxFuel());
        System.out.println("Remaining fuel: "+vehicle.getRemainingFuel());
        System.out.println("Power: "+vehicle.getPower());
    }
}
