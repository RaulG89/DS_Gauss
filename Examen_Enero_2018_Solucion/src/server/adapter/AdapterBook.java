package server.adapter;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.File;

public class AdapterBook {
	public Book getBook(File file) {
		String title = file.getString1();
		String author = file.getString2();
		return new Book(title, author);
	}

	public List<Book> getBooks(List<File> files) {
		List<Book> books = new ArrayList<Book>();
		for (File file : files) {
			books.add(getBook(file));
		}
		return books;
	}
}
