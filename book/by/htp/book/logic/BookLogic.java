package by.htp.book.logic;


import java.util.ArrayList;
import java.util.List;

import by.htp.book.entity.Book;

public class BookLogic {

	public List<Book> findByAuthor(List<Book> base, String author) {
		List<Book> baseByAuthor = new ArrayList<Book>();
		for(Book book : base) {
			if(book.getAuthors().contains(author)) {
				baseByAuthor.add(book);
			}
		}
		return baseByAuthor;
	}

	public List<Book> findByPublisher(List<Book> base, String publisher) {
		List<Book> baseByPublisher = new ArrayList<Book>();
		for(Book book : base) {
			if(book.getPublisher().contains(publisher)) {
				baseByPublisher.add(book);
			}
		}
		return baseByPublisher;
	}

	public List<Book> findByYear(List<Book> base, int year) {
		List<Book> baseByYear = new ArrayList<Book>();
		for(Book book : base) {
			if(book.getYear() > year) {
				baseByYear.add(book);
			}
		}
		return baseByYear;
	}
	
 

}
