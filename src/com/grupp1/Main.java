package com.grupp1;

import com.grupp1.model.Book;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Book book = new Book("Anna");
        System.out.println(book.getName());
    }
}