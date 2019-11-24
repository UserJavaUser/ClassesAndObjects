package by.htp.book.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.book.entity.Book;
import by.htp.book.logic.BookLogic;
import by.htp.book.view.BookPrinter;

public class Main {
	public static void main(String[] args) {
		
		BookLogic logic = new BookLogic();
		BookPrinter printer = new BookPrinter();
		
		Book book1 = new Book(1, "My book", "Author1", "Питер", 2018, 786, 45.89, "твердый");
		Book book2 = new Book(2, "New book", "Author2", "ACТ", 2019, 386, 25.45, "твердый");
		Book book3 = new Book(3, "First book", "Author3", "Питер", 2017, 156, 12.39, "мягкий");
		
		List<Book> base = new ArrayList<Book>();
		base.add(book1);
		base.add(book2);
		base.add(book3);
		printer.printBooks(base);
		
		String author = "Author2";
		List<Book> baseByAuthor = logic.findByAuthor(base, author);
		printer.printBooks(baseByAuthor);
		
		String publisher = "Питер";
		List<Book> baseByPublisher = logic.findByPublisher(base, publisher);
		printer.printBooks(baseByPublisher);
		
		int year = 2018;
		List<Book> baseByYear = logic.findByYear(base, year);
		printer.printBooks(baseByYear);
	}
}
