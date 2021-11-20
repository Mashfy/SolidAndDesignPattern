package solid.liscovSubstitution.good;

//Liskov Substitution Principle
//This means that every subclass or derived class should be substitutable for their base or parent class.

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird("Crow","aves");
        bird.breath();
        bird.consumeFood();
        bird.run();

        Snail snail = new Snail("Slowee","Arthopod");
        snail.breath();
        snail.consumeFood();
        // now the run can't be implemented and liscov substitution isn't violated.


    }
}
