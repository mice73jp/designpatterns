package com.cleanarchitect.interpreter;

import java.io.BufferedReader;
import java.io.FileReader;

import com.cleanarchitect.interpreter.context.Context;
import com.cleanarchitect.interpreter.node.Node;
import com.cleanarchitect.interpreter.node.ProgramNode;

public class Main {
    private static final String DATADIR = "src/main/java/com/cleanarchitect/interpreter/data/";
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(DATADIR + "program.txt"));
            String text;
            while((text = br.readLine()) != null ) {
                System.out.println("text = \"" + text + "\"");
                Node node = new ProgramNode();
                node.parse(new Context(text));
                System.out.println("node = " + node);
            }
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
