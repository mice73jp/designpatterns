package com.cleanarchitect.abstractfactory.listfactory;

import com.cleanarchitect.abstractfactory.factory.Factory;
import com.cleanarchitect.abstractfactory.factory.Link;
import com.cleanarchitect.abstractfactory.factory.Page;
import com.cleanarchitect.abstractfactory.factory.Tray;

public class ListFactory extends Factory{

    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    
}
