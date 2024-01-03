package com.bookverse.bookverse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Book {
    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int BookId;

    public String getGenre() {
        return Genre;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public String getTitle() {
        return Title;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getPublicationYear() {
        return PublicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        PublicationYear = publicationYear;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public void setTitle(String title) {
        Title = title;
    }

    private String Title;
    private String Author;
    private int PublicationYear;
    private int ISBN;
    private String Genre;
    private double Price;
    private int CategoryID;
}
