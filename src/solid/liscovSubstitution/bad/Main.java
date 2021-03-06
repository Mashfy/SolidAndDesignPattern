package solid.liscovSubstitution.bad;

//Liskov Substitution Principle
//This means that every subclass or derived class should be substitutable for their base or parent class.

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird("Crow","Aves ");
        Animal snail = new Snail("Slowee","Arthropod ");


        System.out.println("Name: "+bird.getName()+"\nGroup: "+bird.getGroup());
        bird.breath();
        bird.consumeFood();
        bird.run();

        System.out.println();

        System.out.println("Name: "+snail.getName()+"\nGroup: "+snail.getGroup());
        snail.breath();
        snail.consumeFood();
        snail.run(); // snail shouldn't inherit this property but it did. Hence, violating the principle


    }
}
