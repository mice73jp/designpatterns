package com.cleanarchitect.abstractfactory.listfactory;

import java.util.Iterator;

import com.cleanarchitect.abstractfactory.factory.Item;
import com.cleanarchitect.abstractfactory.factory.Page;

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
        Iterator it = content.iterator();
        while(it.hasNext()) {
            Item item = (Item)it.next();
            builder.append(item.makeHTML());
        }
        builder.append( "</ul>\n" );
        builder.append( "<hr><address>" + author + "</address></hr>\n" );
        builder.append( "</body></html>\n" );
        return builder.toString();
    }
    
}
