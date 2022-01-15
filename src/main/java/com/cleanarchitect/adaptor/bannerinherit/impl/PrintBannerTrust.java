package com.cleanarchitect.adaptor.bannerinherit.impl;

import com.cleanarchitect.adaptor.bannerinherit.Print;

public class PrintBannerTrust implements Print{
    private Banner banner;
    public PrintBannerTrust(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        this.banner.showWithParan();
    }

    @Override
    public void printStrong() {
        this.banner.showWithAster();;
    }
}
