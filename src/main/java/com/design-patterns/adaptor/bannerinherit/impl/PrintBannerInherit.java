package com.cleanarchitect.adaptor.bannerinherit.impl;

import com.cleanarchitect.adaptor.bannerinherit.Print;

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
