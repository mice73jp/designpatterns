package com.cleanarchitect.abstractfactory.listfactory;

import com.cleanarchitect.abstractfactory.factory.Link;

public class ListLink extends Link{

    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "    <li><ahref=\"" + url + "\">" + caption + "</a></li>\n";
    }
    
}
