package com.bookseller.bookseller.Repository;

import com.bookseller.bookseller.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book,Long>
{

}
