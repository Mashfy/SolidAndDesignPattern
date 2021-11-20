package solid.interfaceSegregation.bad;

public class Car extends Vehicle {

    private boolean radioOn;

    public boolean isRadioOn() {
        return radioOn;
    }

    @Override
    public void turnRadioOn() {
        radioOn = true;
    }

    @Override
    public void turnRadioOff() {
        radioOn = false;
    }

    @Override
    public void turnCameraOn() {
        System.out.println("nothing to do here");
    }

    @Override
    public void turnCameraOff() {
        // nothing to do here
    }
}