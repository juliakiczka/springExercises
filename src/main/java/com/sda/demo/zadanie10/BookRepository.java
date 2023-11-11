package com.sda.demo.zadanie10;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);

    Optional<Book> findByISBN(String ISBN);

    Optional<Book> findByTitleAndAuthor(String title, String author);

    List<Book> findTop3ByAuthorOrderByPagesNumDesc(String author);

    List<Book> findByTitleStartingWith(String prefix);

    List<Book> findByPagesNumBetween(Integer min, Integer max);

    @Query("SELECT b FROM books b WHERE b.pagesNum >= :pagesNum")
    List<Book> findWherePagesNumIsGreaterThanX(@Param("pagesNum") Integer pagesNum);
}
