package seedu.addressbook;

import static seedu.addressbook.Food.typeOfFood.*;

public class Food {
    private String name;
    private int quantity;
    public enum typeOfFood {
        BURGER,SOUP,RICE
    }
    public Food (String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public void whatTypeOfFood(typeOfFood food)
    {
        switch(food)
        {
            case BURGER:
                System.out.println("burger");

            case SOUP:
                System.out.println("Soup");

            case RICE:
                System.out.println("Rice");
        }
    }
    public String getName() {
        return name;
    }

    public int getQuantity(){
        return quantity;
    }
}
