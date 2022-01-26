package com.cleanarchitecture.repobelly.designpatterns.facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }
    
    public void title(String title) throws IOException {
        this.writer.write("<html>");
        this.writer.write("<head>");
        this.writer.write("<title>" + title + "</title>");
        this.writer.write("</head>");
        this.writer.write("<body>");
        this.writer.write("<h1>" + title + "</h1>");
    }

    public void paragraph(String msg) throws IOException {
        this.writer.write("<p>" + msg + "</p>" );
    }

    public void link(String href, String caption) throws IOException {
        this.writer.write("<a href=\"" + href + "\">" + caption + "</a>");
    }

    public void mailto(String mailaddr, String username)  throws IOException {
        this.link("mailto:" + mailaddr, username);
    }

    public void close() throws IOException {
        this.writer.write("</body>");
        this.writer.write("</html>");
        this.writer.close();
    }
}
