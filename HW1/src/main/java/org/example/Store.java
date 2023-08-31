package org.example;

import jdk.jfr.Category;

import java.util.ArrayList;

public class Store {
    private ArrayList<Category> categories;


    public Store(){
        this.categories = new ArrayList<>();
    }

    public void addCategory(Category category){
        categories.add(category);
    }

    public void printCatalog(){
        for (Category category: categories) {
            System.out.println(category.getName());
            ArrayList<Good> goods = category.getGoods();
            for (Good good: goods) {
                System.out.println(" - " + good.getName() + " - " + good.getPrice() + " - " + good.getRating());
            }
        }
    }
}
