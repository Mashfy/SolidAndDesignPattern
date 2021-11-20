package solid.openClosed.bad;


public class EventHandler {

    private Car car;

    public EventHandler(final Car car) {
        this.car = car;
    }

    public void changeDrivingMode(final DrivingMode drivingMode) {
        switch (drivingMode) {
            case SPORT:
                car.setPower(500);
                car.setSuspensionHeight(10);
                break;
            case COMFORT:
                car.setPower(400);
                car.setSuspensionHeight(20);
                break;
            default:
                car.setPower(600);
                car.setSuspensionHeight(30);
                break;
            // when we need to add another mode (e.g. ECONOMY) 2 classes will change DrivingMode and EventHandler.
        }
    }
}