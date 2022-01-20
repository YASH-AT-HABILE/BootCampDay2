package com.company;

public class PizzaStore {
    public static void main(String[] args) {
//        System.out.println(Pizzas.GARLIC_PANEER_PIZZA.price);

        for(Pizzas myPizza: Pizzas.values()){
            System.out.println(myPizza + "\t\t$" + myPizza.price + "\\-");
        }

    }
}
