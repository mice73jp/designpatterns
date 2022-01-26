package com.cleanarchitecture.repobelly.designpatterns.abstractfactory.tablefactory;

import java.util.Iterator;

import com.cleanarchitecture.repobelly.designpatterns.abstractfactory.factory.Item;
import com.cleanarchitecture.repobelly.designpatterns.abstractfactory.factory.Page;

public class TablePage extends Page{

    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append( "<html><head><title>" + title + "</title></head>\n" );
        builder.append( "<body>\n" );
        builder.append( "<h1>" + title + "</h1>\n" );
        builder.append( "<table width=\"80%\" border=\"3\">\n" );
        Iterator<Item> it = content.iterator();
        while(it.hasNext()) {
            Item item = it.next();
            builder.append(item.makeHTML());
        }
        builder.append( "</table>\n" );
        builder.append( "<hr><address>" + author + "</address></hr>\n" );
        builder.append( "</body></html>\n" );
        return builder.toString();
    }
    
}
