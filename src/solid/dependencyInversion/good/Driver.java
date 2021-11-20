package solid.dependencyInversion.good;


public class Driver {

    private Vehicle vehicle;

    public Driver(final Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public void increaseSpeed(){
        vehicle.accelerate();
    }

    public void vehicleState(){
        System.out.println(vehicle.getClass().getSimpleName()+" state:---- ");
        System.out.println("Max fuel: "+vehicle.getMaxFuel());
        System.out.println("Remaining fuel: "+vehicle.getRemainingFuel());
        System.out.println("Power: "+vehicle.getPower());
    }



}
