package com.cleanarchitect.prototype;

import com.cleanarchitect.prototype.concreteproduct.MessageBox;
import com.cleanarchitect.prototype.concreteproduct.UnderlinePen;
import com.cleanarchitect.prototype.framework.Manager;
import com.cleanarchitect.prototype.framework.Product;

public class Main {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        UnderlinePen upen = new UnderlinePen('_');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');

        mgr.register("strong message", upen);
        mgr.register("warning box", mbox);
        mgr.register("slash box", sbox);

        Product p1 = mgr.create("strong message");
        p1.use("Hello World!");
        Product p2 = mgr.create("warning box");
        p2.use("This is it!!");
        Product p3 = mgr.create("slash box");
        p3.use("We are the world!");
    }
}
