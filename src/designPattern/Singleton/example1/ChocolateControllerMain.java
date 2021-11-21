package designPattern.Singleton.example1;


class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler uniqueInstance;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            System.out.println("Creating unique instance of Chocolate Boiler");
            uniqueInstance = new ChocolateBoiler();
        }
        System.out.println("Returning instance of Chocolate Boiler");
        return uniqueInstance;
    }

    public void fill() {
        if (isEmpty()) {
            System.out.println("filling chocolate and milk");
            empty = false;
            // fill the boiler with a milk/chocolate mixture
        }
        else{
            System.out.println("Can,t fill: Boiler not empty");
        }
    }


    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println("0o.o0 boiling chocolate and milk");
            // bring the contents to a boil
            boiled = true;
        }
        else{
            if(isEmpty()) System.out.println("Can't boil: boiler is empty");
            else System.out.println("Can't boil: Already boiled");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println("Draining  chocolate bars");
            // drain the boiled milk and chocolate
            empty = true;
        }
        else{
            if(isEmpty()) System.out.println("Can't drain: Boiler is empty");
            else System.out.println("Can't drain: Not boiled yet");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}



public class ChocolateControllerMain {
    public static void main(String args[]) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.fill();
        boiler.drain();
        boiler.boil();
        boiler.drain();

        // will return the existing instance
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }
}