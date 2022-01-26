package com.cleanarchitect.adaptor;

import com.cleanarchitect.adaptor.bannerinherit.Print;
import com.cleanarchitect.adaptor.bannerinherit.impl.PrintBannerInherit;
import com.cleanarchitect.adaptor.bannerinherit.impl.PrintBannerTrust;

public class Main {
    public static void main(String[] args) {
        Print p = new PrintBannerInherit("Hello Adapter Pattern - inherit");
        p.printStrong();
        p.printWeak();

        Print p2 = new PrintBannerTrust("Hello Adapter Pattern - trust");
        p2.printStrong();
        p2.printWeak();
    }
}
