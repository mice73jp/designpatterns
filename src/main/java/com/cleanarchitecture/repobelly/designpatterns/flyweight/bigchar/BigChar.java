package com.cleanarchitecture.repobelly.designpatterns.flyweight.bigchar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charname;
    private String fontdata;

    private static final String DATADIR = "src/main/java/com/cleanarchitect/flyweight/data/";

    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(
                new FileReader(DATADIR + "big" + charname + ".txt")
            );

            String line;
            StringBuilder buf = new StringBuilder();
            while((line = reader.readLine()) != null ) {
                buf.append(line);
                buf.append("\n");
            }
            reader.close();
            this.fontdata = buf.toString();
        } catch(IOException e) {
            this.fontdata = charname + "?";
        }
    }

    public void print() {
        System.out.print(this.fontdata);
    }
}
