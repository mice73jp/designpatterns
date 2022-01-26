package com.cleanarchitecture.repobelly.designpatterns.prototype.concreteproduct;

import com.cleanarchitecture.repobelly.designpatterns.prototype.framework.Product;

public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
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
        int length = s.getBytes().length;
        System.out.println( "\"" + s + "\"");
        System.out.print( " " );
        for ( int i = 0; i < length; i++ ) {
            System.out.print( ulchar );
        }
        System.out.println( "");
    }
    
}
