package com.wordpress.fjrodriguez.builders.hierarchicalbuilder;

public class Main {

    public static void main(String[] args) {
        final NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();
        final Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM).sauceInside().build();

        System.out.println(pizza);
        System.out.println(calzone);
    }
}
