package com.cleanarchitecture.repobelly.designpatterns.builder.worker.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.cleanarchitecture.repobelly.designpatterns.builder.worker.Builder;

public class HTMLBuilder extends Builder {
    private String filename;
    private PrintWriter writer;

    @Override
    public Object getResult() {
        writer.println("</body></html>");
        writer.close();
        return filename;
    }

    @Override
    public void makeItems(String[] items) {
        writer.println("<ul>");
        for ( int i = 0; i < items.length; i++ ) {
            writer.println("<li>" + items[i] + "</li>");
        }
        writer.println("</ul>");
    }

    @Override
    public void makeString(String str) {
        writer.println("<p>" + str + "</p>");
    }

    @Override
    public void makeTitle(String title) {
        this.filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(this.filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
    }
    
}
