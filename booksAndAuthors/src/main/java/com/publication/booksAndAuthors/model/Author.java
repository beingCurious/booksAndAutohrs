package com.publication.booksAndAuthors.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String firstName;
	private String lastName;

	// Target Side
	@ManyToMany(mappedBy="authorsOfThisBook")
	private Set<Book> booksByAuthor = new HashSet<>();

	public Author() {
	}

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Author(String firstName, String lastName, Set<Book> booksByAuthor) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.booksByAuthor = booksByAuthor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Book> getBooksByAuthor() {
		return booksByAuthor;
	}

	public void setBooksByAuthor(Set<Book> booksByAuthor) {
		this.booksByAuthor = booksByAuthor;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", booksByAuthor="
				+ booksByAuthor + "]";
	}

}
