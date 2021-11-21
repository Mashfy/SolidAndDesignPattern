package designPattern.templatepattern;

public class Main {

    public static void main(String[] args){

        Burger meatBurger = new MeatBurger();

        meatBurger.makeSandwich();

        System.out.println();

        Burger vegetablesBurger = new VegetablesBurger();

        vegetablesBurger.makeSandwich();

    }

}