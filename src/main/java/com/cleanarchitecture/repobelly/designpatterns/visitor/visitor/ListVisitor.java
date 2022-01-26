package com.cleanarchitecture.repobelly.designpatterns.visitor.visitor;

import java.util.Iterator;

import com.cleanarchitecture.repobelly.designpatterns.visitor.datastructure.Directory;
import com.cleanarchitecture.repobelly.designpatterns.visitor.datastructure.Entry;
import com.cleanarchitecture.repobelly.designpatterns.visitor.datastructure.File;

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
