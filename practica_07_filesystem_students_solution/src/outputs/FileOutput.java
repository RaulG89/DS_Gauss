package outputs;

import java.io.*;

public class FileOutput implements Output {
	private String fileName;
	private FileWriter file;

	public FileOutput(String fileName) {
		try {
			this.fileName = fileName;
			file = new FileWriter(fileName);
		} catch (IOException e) {
			System.err.println("Error al leer el fichero " + this.fileName);
		}
	}

	@Override
	public void send(char c) {
		try {
			file.append(c);
		} catch (IOException e) {
			System.err.println("Error al enviar el fichero " + this.fileName);
		}
	}

	@Override
	public void close() {
		try {
			file.close();
		} catch (IOException e) {
			System.err.println("Error al cerrar el fichero " + this.fileName);
		}
	}

}
