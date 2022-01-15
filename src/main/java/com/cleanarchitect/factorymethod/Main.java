package com.cleanarchitect.factorymethod;

import java.util.List;

import com.cleanarchitect.factorymethod.framework.Factory;
import com.cleanarchitect.factorymethod.framework.Product;
import com.cleanarchitect.factorymethod.idcard.IDCard;
import com.cleanarchitect.factorymethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("채민석");
        Product card2 = factory.create("伊藤恵美");
        Product card3 = factory.create("John Franklin");

        card1.use();
        card2.use();
        card3.use();

        List owners = ((IDCardFactory)factory).getOwners();
        for(Object owner : owners) {
            System.out.println((String)owner);
        }
    }
}
