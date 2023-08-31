package org.example;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Good> goods;



    public Basket(){
        this.goods = new ArrayList<>();
    }


    public ArrayList<Good> getGoods() {
        return goods;
    }

    public void addGood(Good good){
        goods.add(good);
    }

    public void removeGood(Good good){
        goods.remove(good);
    }

}
