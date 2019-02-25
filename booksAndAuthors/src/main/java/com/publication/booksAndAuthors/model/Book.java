package com.publication.booksAndAuthors.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title;
	private String isbn;
	private String publisher;

	@ManyToMany
	@JoinTable(name="author_book", joinColumns=@JoinColumn(name="book_id"),
	inverseJoinColumns=@JoinColumn(name="author_id")) 

	private Set<Author> authorsOfThisBook = new HashSet<>();

	public Book() {
	}

	public Book(String title, String isbn, String publisher) {
		this.title = title;
		this.isbn = isbn;
		this.publisher = publisher;
	}

	public Book(String title, String isbn, String publisher, Set<Author> authorsOfThisBook) {
		this.title = title;
		this.isbn = isbn;
		this.publisher = publisher;
		this.authorsOfThisBook = authorsOfThisBook;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Set<Author> getAuthorsOfThisBook() {
		return authorsOfThisBook;
	}

	public void setAuthorsOfThisBook(Set<Author> authorsOfThisBook) {
		this.authorsOfThisBook = authorsOfThisBook;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", isbn=" + isbn + ", publisher=" + publisher
				+ ", authorsOfThisBook=" + authorsOfThisBook + "]";
	}

	
}
