package solid.openClosed.good;


public class EventHandler {

    private Car car;

    public EventHandler(final Car car) {
        this.car = car;
    }

    public void changeDrivingMode(final DrivingMode drivingMode){
        car.setPower(drivingMode.getPower());
        car.setSuspensionHeight(drivingMode.getSuspensionHeight());
        // now, when we need to add another mode (e.g. ECONOMY) just create a new class: Economy.
    }
}