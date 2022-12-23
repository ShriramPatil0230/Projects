package com.driver;

public class DeluxPizza extends Pizza{
    DeluxPizza(boolean isVeg){
        super(isVeg);

        extraCheese();
        extraTopping();
    }
}
