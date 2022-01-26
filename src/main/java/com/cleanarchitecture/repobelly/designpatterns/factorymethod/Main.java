package com.cleanarchitecture.repobelly.designpatterns.factorymethod;

import java.util.List;

import com.cleanarchitecture.repobelly.designpatterns.factorymethod.framework.Factory;
import com.cleanarchitecture.repobelly.designpatterns.factorymethod.framework.Product;
import com.cleanarchitecture.repobelly.designpatterns.factorymethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("채민석");
        Product card2 = factory.create("伊藤恵美");
        Product card3 = factory.create("John Franklin");

        card1.use();
        card2.use();
        card3.use();

        List<String> owners = ((IDCardFactory)factory).getOwners();
        for(String owner : owners) {
            System.out.println(owner);
        }
    }
}
