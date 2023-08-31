package org.example;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Good> goods;



    public Category(String name){
        this.name = name;
        this.goods = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Good> getGoods() {
        return goods;
    }

    public void addGood(Good good){
        goods.add(good);
    }

}
