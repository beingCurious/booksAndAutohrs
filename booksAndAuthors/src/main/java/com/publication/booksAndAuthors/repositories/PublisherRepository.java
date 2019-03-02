package com.publication.booksAndAuthors.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.publication.booksAndAuthors.model.Publisher;

@Repository
public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
