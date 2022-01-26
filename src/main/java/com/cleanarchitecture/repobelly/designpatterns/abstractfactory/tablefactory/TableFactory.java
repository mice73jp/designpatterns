package com.cleanarchitecture.repobelly.designpatterns.abstractfactory.tablefactory;

import com.cleanarchitecture.repobelly.designpatterns.abstractfactory.factory.Factory;
import com.cleanarchitecture.repobelly.designpatterns.abstractfactory.factory.Link;
import com.cleanarchitecture.repobelly.designpatterns.abstractfactory.factory.Page;
import com.cleanarchitecture.repobelly.designpatterns.abstractfactory.factory.Tray;

public class TableFactory extends Factory{

    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }
    
}
