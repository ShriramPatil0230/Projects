package com.driver;

public class Pizza {
    private final int base_price; // different for ved and non veg

    private final int topping_price; // different for ved and non veg

    private final int cheese_price=80; // same for both .

    private final int bag_price=20;

    private final boolean isVeg;

    private int total;

    private boolean isCheeseAdded = false;
    private boolean isToppingAdded = false;
    private boolean istakeAwayAdded = false;

    Pizza(boolean isVeg){
        this.isVeg= isVeg;

        if(isVeg){

            base_price = 300;
            topping_price = 70;
            total = 300;
        }
        else{
            base_price = 400;
            topping_price = 120;
            total = 400;
        }
    }
    public void extraCheese(){
        if(isCheeseAdded == false) {
            total = total + cheese_price;
            isCheeseAdded = true;
        }
    }
    public void extraTopping(){
        if(isToppingAdded == false) {
            total = total + topping_price;
            isToppingAdded = true;
        }
    }

    public void takeAway(){
        if(istakeAwayAdded == false) {
            total = total + bag_price;
            istakeAwayAdded = true;
        }
    }
    public String billGenerator(){
        String bill = "Base Price Of The Pizza "+ base_price + "\n";
        if(isCheeseAdded)
            bill = bill + "Extra Cheese Added: " + cheese_price + "\n";

        if(isToppingAdded)
            bill = bill + "Extra Toppings Added: " + topping_price + "\n";

        if(istakeAwayAdded)
            bill = bill + "Paperbag Added: " + bag_price + "\n";

        bill = bill + "Total Price: " + total;

        return bill;
    }
}
