package solid.interfaceSegregation.good;

import solid.interfaceSegregation.bad.Car;

public class Main {
    public static void main(String[] args) {
        CarModified car = new CarModified();
        car.turnRadioOn();
        car.turnRadioOff();
        if(car.isRadioOn()){
            System.out.println("car radio on");
        }
        else {
            System.out.println("car radio off");
        }
//        car.turnCameraOn(); // wont work

    }
}
