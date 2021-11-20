package solid.interfaceSegregation.bad;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.turnRadioOn();
        car.turnRadioOff();
        if(car.isRadioOn()){
            System.out.println("car radio on");
        }
        else {
            System.out.println("car radio off");
        }
        car.turnCameraOn(); // this is redundant


    }
}
