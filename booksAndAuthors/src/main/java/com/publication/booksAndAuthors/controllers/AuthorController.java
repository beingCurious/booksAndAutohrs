package com.publication.booksAndAuthors.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.publication.booksAndAuthors.repositories.AuthorRepository;

@Controller
public class AuthorController {
	private AuthorRepository authorRepo;

	public AuthorController(AuthorRepository authorRepo) {
		this.authorRepo = authorRepo;
	}

	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		
		model.addAttribute("authors", authorRepo.findAll());
		
		return "authors";
	}
	
	
}
