package com.cleanarchitecture.repobelly.designpatterns.abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {
    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    public void add(Item item) {
        this.content.add(item);
    }

    public void output() {
        try {
            String filename = title + ".html";
            FileWriter writer = new FileWriter(filename);
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + "을 작성했습니다.");
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
