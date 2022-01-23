package com.cleanarchitect.visitor.datastructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cleanarchitect.visitor.visitor.Visitor;

public class Directory extends Entry{
    private String name;
    private List<Entry> directory = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public Entry add(Entry e) {
        this.directory.add(e);
        return this;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while(it.hasNext()) {
            Entry e = (Entry)it.next();
            size += e.getSize();
        }
        return size;
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);   
    }

    public Iterator iterator() {
        return directory.iterator();
    }
}
