package com.cleanarchitecture.repobelly.designpatterns.iterator;

import com.cleanarchitecture.repobelly.designpatterns.iterator.bookshelf.Iterator;
import com.cleanarchitecture.repobelly.designpatterns.iterator.bookshelf.IteratorBF;
import com.cleanarchitecture.repobelly.designpatterns.iterator.bookshelf.impl.Book;
import com.cleanarchitecture.repobelly.designpatterns.iterator.bookshelf.impl.BookShelf;

public class Main {
    public static void main(String[] args) {
        BookShelf bookshelf = new BookShelf();
        // BookShelf bookshelf = new BookShelf(4);  // When using BookShelf with array
        bookshelf.appendBook(new Book("0.Around the World in 80 days"));
        bookshelf.appendBook(new Book("0.Bible"));
        bookshelf.appendBook(new Book("0.Cinderella"));
        bookshelf.appendBook(new Book("0.Daddy.Long.Legs"));
        bookshelf.appendBook(new Book("1.Around the World in 80 days"));
        bookshelf.appendBook(new Book("1.Bible"));
        bookshelf.appendBook(new Book("1.Cinderella"));
        bookshelf.appendBook(new Book("1.Daddy.Long.Legs"));
        bookshelf.appendBook(new Book("2.Around the World in 80 days"));
        bookshelf.appendBook(new Book("2.Bible"));
        bookshelf.appendBook(new Book("2.Cinderella"));
        bookshelf.appendBook(new Book("2.Daddy.Long.Legs"));

        Iterator it = bookshelf.iterator();
        System.out.println("--- BookShelf forward by one way"); 
        while(it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName()); 
        }

        IteratorBF itbf = bookshelf.iteratorBF();
        System.out.println("--- BookShelf forward by two way"); 
        while(itbf.hasNext()) {
            System.out.println(((Book)itbf.next()).getName()); 
        }
        System.out.println("--- BookShelf backward by two way"); 
        while(itbf.hasPrev()) {
            System.out.println(((Book)itbf.prev()).getName()); 
        }

    }
}
