package com.cleanarchitecture.repobelly.designpatterns.abstractfactory.listfactory;

import java.util.Iterator;

import com.cleanarchitecture.repobelly.designpatterns.abstractfactory.factory.Item;
import com.cleanarchitecture.repobelly.designpatterns.abstractfactory.factory.Page;

public class ListPage extends Page{

    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuilder builder = new StringBuilder();
        builder.append( "<html><head><title>" + title + "</title></head>\n" );
        builder.append( "<body>\n" );
        builder.append( "<h1>" + title + "</h1>\n" );
        builder.append( "<ul>\n" );
        Iterator<Item> it = content.iterator();
        while(it.hasNext()) {
            Item item = it.next();
            builder.append(item.makeHTML());
        }
        builder.append( "</ul>\n" );
        builder.append( "<hr><address>" + author + "</address></hr>\n" );
        builder.append( "</body></html>\n" );
        return builder.toString();
    }
    
}
