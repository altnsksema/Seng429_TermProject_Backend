package com.bookverse.bookverse.controller;
import com.bookverse.bookverse.model.Book;
import com.bookverse.bookverse.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("/add")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteBook(@PathVariable Integer id){
        bookService.deleteBook(id);
    }
}
