package com.cleanarchitect.visitor;

import com.cleanarchitect.visitor.datastructure.Directory;
import com.cleanarchitect.visitor.datastructure.File;
import com.cleanarchitect.visitor.datastructure.FileTreatmentException;
import com.cleanarchitect.visitor.visitor.ListVisitor;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Making root entries...");
            Directory rootdir = new Directory("root");
            Directory bindir = new Directory("bin");
            Directory tmpdir = new Directory("tmp");
            Directory usrdir = new Directory("usr");
            rootdir.add(bindir);
            rootdir.add(tmpdir);
            rootdir.add(usrdir);
            bindir.add(new File("view", 10000));
            bindir.add(new File("latex", 20000));
            rootdir.accept(new ListVisitor());      // Composite pattern code : rootdir.printList();

            System.out.println("");
            System.out.println("Making user entries...");
            Directory kimdir = new Directory("Kim");
            Directory leedir = new Directory("Lee");
            Directory kangdir = new Directory("Kang");
            usrdir.add(kimdir);
            usrdir.add(leedir);
            usrdir.add(kangdir);
            kimdir.add(new File("diary.html", 100));
            kimdir.add(new File("Composite.java", 200));
            leedir.add(new File("Memo.tex", 300));
            kangdir.add(new File("game.doc", 400));
            kangdir.add(new File("junk.mail", 500));
            rootdir.accept(new ListVisitor());      // Composite pattern code : rootdir.printList();
        } catch ( FileTreatmentException e ) {
            e.printStackTrace();
        }    }
}
