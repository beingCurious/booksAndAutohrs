package com.publication.booksAndAuthors.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.publication.booksAndAuthors.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

}
