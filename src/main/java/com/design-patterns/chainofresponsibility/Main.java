package com.cleanarchitect.chainofresponsibility;

import com.cleanarchitect.chainofresponsibility.support.LimitSupport;
import com.cleanarchitect.chainofresponsibility.support.NoSupport;
import com.cleanarchitect.chainofresponsibility.support.OddSupport;
import com.cleanarchitect.chainofresponsibility.support.SpecialSupport;
import com.cleanarchitect.chainofresponsibility.support.Support;
import com.cleanarchitect.chainofresponsibility.trouble.Trouble;

public class Main {
    public static void main(String[] args) {
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob", 100);
        Support charlie = new SpecialSupport("Charlie", 429);
        Support diana = new LimitSupport("Diana", 200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred", 300);

        alice.setnext(bob).setnext(charlie).setnext(diana).setnext(elmo).setnext(fred);
        for (int i = 0; i < 500; i++ ) {
            alice.support(new Trouble(i));
        }
    }
}
