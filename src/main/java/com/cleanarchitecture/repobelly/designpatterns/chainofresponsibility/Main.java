package com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility;

import com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility.support.LimitSupport;
import com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility.support.NoSupport;
import com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility.support.OddSupport;
import com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility.support.SpecialSupport;
import com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility.support.Support;
import com.cleanarchitecture.repobelly.designpatterns.chainofresponsibility.trouble.Trouble;

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
