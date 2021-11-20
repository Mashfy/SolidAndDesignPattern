package solid.interfaceSegregation.good;

//Interface Segregation Principle
//A client should never be forced to implement an interface that it doesn’t use, or clients shouldn’t be forced to depend on methods they do not use

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
