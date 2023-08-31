package org.example;

import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Main {
    public static void main(String[] args) {

        Store store = new Store();


    Category category1 = new Category("Fruits");
    category1.addGood(new Good("Oranges", 100.00, 5));
    category1.addGood(new Good("Grapes", 150.00, 4));

    Category category2 = new Category("Vegetables");
    category2.addGood(new Good("Beetroot", 25.00, 3));
    category2.addGood(new Good("Onions", 45.00, 6));

    store.addCategory(category1);
    store.addCategory(category2);

    store.printCatalog();

    User user1 = new User("Adam", "11111");
    User user2 = new User("Eva", "22222");

    user1.getBasket().addGood(category1.getGoods().get(0));
    user2.getBasket().addGood(category2.getGoods().get(1));

    category1.getGoods().remove(0);
    category2.getGoods().remove(1);


    System.out.println(user1.getLogin() + " - Purchases: ");
    ArrayList<Good> user1Good = user1.getBasket().getGoods();
    for (Good good : user1Good){
        System.out.println(" - " + good.getName() + " - " + good.getPrice() + " - " + good.getRating());
    }


    System.out.println(user2.getLogin() + " - Purchases: ");
    ArrayList<Good> user2Good = user2.getBasket().getGoods();
    for (Good good : user1Good){
        System.out.println(" - " + good.getName() + " - " + good.getPrice() + " - " + good.getRating());
    }

    }
}