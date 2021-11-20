package solid.openClosed.good;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        EventHandler eventHandler = new EventHandler(car);
        // set the default features of car
        car.setPower(100);
        car.setSuspensionHeight(5);
        System.out.println("Default car\npower "+car.getPower()+"\n"+"Suspension:"+
                car.getSuspensionHeight());
//        modify car with event handler
//        make it sport car
        Sport sport = new Sport();
        System.out.println();
        eventHandler.changeDrivingMode(sport);
        System.out.println(sport.getClass().getSimpleName()+" car"+"\npower "+car.getPower()+"\n"+"Suspension:"+
                car.getSuspensionHeight());

//        now make it economy
        Economy economy = new Economy();
        eventHandler.changeDrivingMode(economy);
        System.out.println();
        System.out.println(economy.getClass().getSimpleName()+" car"+"\npower "+car.getPower()+"\n"+"Suspension:"+
                car.getSuspensionHeight());

    }
}
