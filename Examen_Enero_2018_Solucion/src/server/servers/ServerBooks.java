package server.servers;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.File;
import server.ServerI;

public class ServerBooks implements ServerI {
	private List<File> books;

	@Override
	public List<File> download() {
		System.out.println("Bajando Libros del servidor...");
		if (books == null) {
			books = new ArrayList<>();
			books.add(new Book("El Código Da Vinci", "Dan Brown"));
			books.add(new Book("Design Patterns", "Erich Gamma"));
		}
		return books;
	}

	@Override
	public void upload(List<File> files) {
		System.out.println("Enviando libros al servidor...");
		this.books = files;
	}

}
