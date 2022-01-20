package com.company;

public enum Pizzas {
    GARLIC_PANEER_PIZZA((short)400),
    BUTTER_OVERLOADED_PIZZA((short)240),
    MASHROOM_PIZZA((short)380),
    TANDOORI_PANEER_PIZZA((short)460),
    MIXED_VEG_PIZZA((short)500);

    final short price;

    Pizzas(short price){
        this.price = price;
    }
}
