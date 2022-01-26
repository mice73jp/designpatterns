package com.cleanarchitecture.repobelly.designpatterns.adaptor.bannerinherit.impl;

import com.cleanarchitecture.repobelly.designpatterns.adaptor.bannerinherit.Print;

public class PrintBannerInherit extends Banner implements Print{

    public PrintBannerInherit(String string) {
        super(string);
    }

    @Override
    public void printStrong() {
        showWithAster();
    }

    @Override
    public void printWeak() {
        showWithParan();
    }
    
}
