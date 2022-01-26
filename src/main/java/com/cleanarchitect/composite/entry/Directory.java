package com.cleanarchitect.composite.entry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry{
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix + "/" + this);
        Iterator<Entry> it = directory.iterator();
        while(it.hasNext()) {
            Entry ent = it.next();
            ent.printList(prefix + "/" + name);
        }

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator<Entry> it = directory.iterator();
        while(it.hasNext()) {
            Entry ent = it.next();
            size += ent.getSize();
        }

        return size;
    }

    @Override
    public Entry add(Entry e) {
        this.directory.add(e);
        return this;
    }
}
