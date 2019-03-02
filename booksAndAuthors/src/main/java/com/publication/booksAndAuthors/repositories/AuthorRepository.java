package com.publication.booksAndAuthors.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.publication.booksAndAuthors.model.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
