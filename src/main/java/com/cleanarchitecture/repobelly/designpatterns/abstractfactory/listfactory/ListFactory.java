package com.cleanarchitecture.repobelly.designpatterns.abstractfactory.listfactory;

import com.cleanarchitecture.repobelly.designpatterns.abstractfactory.factory.Factory;
import com.cleanarchitecture.repobelly.designpatterns.abstractfactory.factory.Link;
import com.cleanarchitecture.repobelly.designpatterns.abstractfactory.factory.Page;
import com.cleanarchitecture.repobelly.designpatterns.abstractfactory.factory.Tray;

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
