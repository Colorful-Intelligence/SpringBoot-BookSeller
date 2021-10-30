package com.bookseller.bookseller.Service;

import com.bookseller.bookseller.Model.Book;

import java.util.List;

public interface IBookService {
    Book saveBook(Book book);

    void deleteBook(Long id);

    List<Book> findAllBooks();
}
