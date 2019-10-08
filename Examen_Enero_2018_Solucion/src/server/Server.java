package server;

import java.util.ArrayList;
import java.util.List;

import model.Book;
import model.CompactDisc;
import model.File;
import model.Mobile;
import server.adapter.AdapterFactory;
import server.servers.ServerFactory;

// Clase que simula el acceso al servidor web de la tienda online
public class Server {

	private AdapterFactory adapterFactory;
	private ServerFactory serverFactory;

	public Server() {
		this.serverFactory = new ServerFactory();
		this.adapterFactory = new AdapterFactory();
	}

	// Este método simula el conectar con el servidor y descargarse la lista de
	// discos compactos
	public List<CompactDisc> downloadCompactDiscs() {
		List<File> files = this.serverFactory.getCompactDiscs().download();
		return this.adapterFactory.getCompactDiscs().getCompactDisks(files);
	}

	// Este método simula el conectar con el servidor y descargarse la lista de
	// móviles
	public List<Mobile> downloadMobiles() {
		List<File> files = this.serverFactory.getMobiles().download();
		return this.adapterFactory.getMobiles().getMobiles(files);
	}

	// Este metodo simula el conectar con el servidor y descargarse la lista de
	// libros
	public List<Book> downloadBooks() {
		List<File> files = this.serverFactory.getBooks().download();
		return this.adapterFactory.getBooks().getBooks(files);
	}

	// Este método simula el conectar con el servidor y enviarle la lista de DVD
	// modificada
	public void uploadCompactDiscs(List<CompactDisc> discos) {
		List<File> files = new ArrayList<File>(discos);
		this.serverFactory.getCompactDiscs().upload(files);
	}

	// Este método simula el conectar con el servidor y enviarle la lista de
	// móviles modificada
	public void uploadMobiles(List<Mobile> moviles) {
		List<File> files = new ArrayList<File>(moviles);
		this.serverFactory.getMobiles().upload(files);
	}

	// Este método simula el conectar con el servidor y enviarle la lista de
	// Libro modificada
	public void uploadBooks(List<Book> libros) {
		List<File> files = new ArrayList<File>(libros);
		this.serverFactory.getBooks().upload(files);
	}
}
