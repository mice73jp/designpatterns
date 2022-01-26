package com.cleanarchitecture.repobelly.designpatterns.flyweight.bigstring;

import com.cleanarchitecture.repobelly.designpatterns.flyweight.bigchar.BigChar;
import com.cleanarchitecture.repobelly.designpatterns.flyweight.bigchar.BigCharFactory;

public class BigString {
    private BigChar[] bigchars;

    public BigString(String string) {
        this.bigchars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getInstance();
        for(int i = 0; i < bigchars.length; i++ ) {
            bigchars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    public void print() {
        for(int i = 0; i < bigchars.length; i++ ) {
            bigchars[i].print();
        }
    }    
}
