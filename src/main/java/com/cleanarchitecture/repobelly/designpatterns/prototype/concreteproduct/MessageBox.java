package com.cleanarchitecture.repobelly.designpatterns.prototype.concreteproduct;

import com.cleanarchitecture.repobelly.designpatterns.prototype.framework.Product;

public class MessageBox implements Product {
    private char decochar;

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public void use(String s) {
        int lenght = s.getBytes().length;
        for( int i = 0; i < lenght + 4; i++ ) {
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar + " " + s + " "  + decochar);
        for( int i = 0; i < lenght + 4; i++ ) {
            System.out.print(decochar);
        }
        System.out.println("");
    }
    
}
