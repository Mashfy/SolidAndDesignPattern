package designPattern.decoratorPattern;


// The decorator allows you to modify an object dynamically.
// You would ude it when you want the capabilities of inheritance
// with subclasses, but you need to add functionality at run time.
// It is more flexible than inheritance.
// Simplifies code because you add functionality using many simple classes
// Rather than rewrite old code you can extend with new code


public class Main {

    public static void main(String[] args){

        // The PlainPizza object is sent to the Mozzarella constructor
        // and then to the TomatoSauce constructor

//        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));
        Pizza basicPizza = new PlainPizza();
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());
        System.out.println();

        basicPizza = new Mozzarella(basicPizza);
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());
        System.out.println();

        basicPizza = new TomatoSauce(basicPizza);
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Price: " + basicPizza.getCost());



    }

}