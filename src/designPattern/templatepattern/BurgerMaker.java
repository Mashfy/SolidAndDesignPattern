package designPattern.templatepattern;

public class BurgerMaker {

    public static void main(String[] args){

        Burger meatBurger = new MeatBurger();

        meatBurger.makeSandwich();

        System.out.println();

        Burger vegetablesBurger = new VegetablesBurger();

        vegetablesBurger.makeSandwich();

    }

}