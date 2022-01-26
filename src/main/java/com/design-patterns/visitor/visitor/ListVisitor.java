package com.cleanarchitect.visitor.visitor;

import java.util.Iterator;

import com.cleanarchitect.visitor.datastructure.Directory;
import com.cleanarchitect.visitor.datastructure.Entry;
import com.cleanarchitect.visitor.datastructure.File;

public class ListVisitor extends Visitor{
    private String currentdir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentdir + "/" + file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while(it.hasNext()) {
            Entry ent = (Entry)it.next();
            ent.accept(this);
        }
        currentdir = savedir;
    }
    
}
