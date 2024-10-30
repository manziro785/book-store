package com.example.BookStore.book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("SELECT b FROM Book b WHERE b.name = ?1")
    Optional<Book> findBookByName(String name);


    @Query("SELECT x from Book x where startPrice <= price <= endPrice ")
    Optional<Book> findBookByMaxPrice(float startPrice, float endPrice);



}