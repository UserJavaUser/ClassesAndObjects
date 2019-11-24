package by.htp.book.view;

import java.util.List;

import by.htp.book.entity.Book;

public class BookPrinter {
	
	public void printBooks(List<Book> list) {
		for(Book book : list) {
			System.out.println(book);
		}
	}
}
