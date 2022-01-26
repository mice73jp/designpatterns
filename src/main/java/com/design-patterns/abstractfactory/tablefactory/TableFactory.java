package com.cleanarchitect.abstractfactory.tablefactory;

import com.cleanarchitect.abstractfactory.factory.Factory;
import com.cleanarchitect.abstractfactory.factory.Link;
import com.cleanarchitect.abstractfactory.factory.Page;
import com.cleanarchitect.abstractfactory.factory.Tray;

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
