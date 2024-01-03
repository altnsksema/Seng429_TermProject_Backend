package com.bookverse.bookverse.service;
import com.bookverse.bookverse.model.Book;
import com.bookverse.bookverse.repository.BookRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }


    public void deleteBook(Integer id){
        bookRepository.deleteById(id);
    }

    public Book updateBook(Integer bookId, Book updatedBook) {
        Optional<Book> optionalBook = bookRepository.findById(bookId);

        if (optionalBook.isPresent()) {
            Book existingBook = optionalBook.get();

            BeanUtils.copyProperties(updatedBook, existingBook, "id");
            return bookRepository.save(existingBook);
        } else {
            throw new RuntimeException("Not found! " + bookId);
        }
    }
}
