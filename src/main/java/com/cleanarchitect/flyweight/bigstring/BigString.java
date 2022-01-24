package com.cleanarchitect.flyweight.bigstring;

import com.cleanarchitect.flyweight.bigchar.BigChar;
import com.cleanarchitect.flyweight.bigchar.BigCharFactory;

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
