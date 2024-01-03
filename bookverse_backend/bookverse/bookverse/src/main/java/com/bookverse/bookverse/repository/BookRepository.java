package com.bookverse.bookverse.repository;

import com.bookverse.bookverse.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
