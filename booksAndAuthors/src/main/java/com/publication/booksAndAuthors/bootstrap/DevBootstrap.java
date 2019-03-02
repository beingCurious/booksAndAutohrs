package com.publication.booksAndAuthors.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.publication.booksAndAuthors.model.Author;
import com.publication.booksAndAuthors.model.Book;
import com.publication.booksAndAuthors.repositories.AuthorRepository;
import com.publication.booksAndAuthors.repositories.BookRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

	//@Autowired
	private AuthorRepository authorRepository;
	//@Autowired
	private BookRepository bookRepository;
	
	// Use of Constructor, instead of @Autowired, is probably to allow the programmer to use the mocks in the tests
    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		initData();
	}

    private void initData(){
        //Eric
        Author eric = new Author("Eric", "Evans");
        Book  ddd = new Book("Domain Driven Design", "1234", "Harper Collins");
        eric.getBooksByAuthor().add(ddd);
        ddd.getAuthorsOfThisBook().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        //Rod
        Author rod = new Author("Rod", "Johnson");
        Book noEJB = new Book("J2EE Development without EJB", "23444", "Wrox" );
        rod.getBooksByAuthor().add(noEJB);
        noEJB.getAuthorsOfThisBook().add(rod);

        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
