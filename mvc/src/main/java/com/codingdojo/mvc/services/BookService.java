package com.codingdojo.mvc.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.codingdojo.mvc.models.Book;
import com.codingdojo.mvc.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
    // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    // creates a book
    public Book createBook(Book b) {
        return bookRepository.save(b);
    }
    
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    
    // edits a book
    public Book updateBook(Book book) {
    	System.out.println(book.getId());
    	return bookRepository.save(book);
    }
    
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    	Optional <Book> book = bookRepository.findById(id);
    	
    	if(book.isPresent()) {
    		Book update = book.get();
    		update.setTitle(title);
    		update.setDescription(desc);
    		update.setLanguage(lang);
    		update.setNumberOfPages(numOfPages);
    		return bookRepository.save(update);
    	}
    	return null;        
    }
    
    // deletes a book
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
    

}
