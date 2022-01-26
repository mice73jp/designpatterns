package com.cleanarchitect.abstractfactory.listfactory;

import java.util.Iterator;

import com.cleanarchitect.abstractfactory.factory.Item;
import com.cleanarchitect.abstractfactory.factory.Tray;

public class ListTray extends Tray{

    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append( "<li>\n" );
        builder.append( caption + "\n" );
        builder.append( "<ul>\n" );
        Iterator<Item> it = tray.iterator();
        while(it.hasNext()) {
            Item item = it.next();
            builder.append(item.makeHTML());
        }

        builder.append( "</ul>\n" );
        builder.append( "</li>\n" );
        return builder.toString();
    }
}
