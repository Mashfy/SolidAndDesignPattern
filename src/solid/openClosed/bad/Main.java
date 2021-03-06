package solid.openClosed.bad;

//Open-Closed Principle
//Objects or entities should be open for extension but closed for modification.

        public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        EventHandler eventHandler = new EventHandler(car);

        car.setPower(100);
        car.setSuspensionHeight(5);

        System.out.println("Default car \npower "+car.getPower()+"\n"+"Suspension:"+
                car.getSuspensionHeight());

        eventHandler.changeDrivingMode(DrivingMode.COMFORT);
        System.out.println();
        System.out.println("After eventhandler\npower "+car.getPower()+"\n"+"Suspension:"+
                car.getSuspensionHeight());


    }
}
