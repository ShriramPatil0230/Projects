package com.driver;

public class Bill {
    public static void main(String[] args){
        System.out.println("testing");

        Pizza order1 = new Pizza(true);
        order1.extraCheese();
        order1.extraTopping();
        order1.takeAway();
        System.out.println("Bill = "+order1.billGenerator());
    }
}
