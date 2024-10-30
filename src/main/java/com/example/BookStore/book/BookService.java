package com.example.BookStore.book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public static void addNewBook(Book book) {
        System.out.println(book);
    }

    public List<Book> bookList(){
        return bookRepository.findAll();
    }

    public void addBook(Book book){
        System.out.println(book);
    }
}