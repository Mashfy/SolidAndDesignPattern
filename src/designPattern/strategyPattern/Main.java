package designPattern.strategyPattern;

//Strategy is a behavioral design pattern that lets you define a family of algorithms,
//put each of them into a separate class, and make their objects interchangeable.
//The Strategy pattern suggests that you take a class that does something specific in a
//lot of different ways and extract all of these algorithms into separate classes called strategies.


public class Main {

    public static void main(String[] args){

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());

        System.out.println("Bird: " + tweety.tryToFly());

        // This allows dynamic changes for flyingType

        sparky.setFlyingAbility(new ItFlys());

        System.out.println("Dog: " + sparky.tryToFly());

    }

}