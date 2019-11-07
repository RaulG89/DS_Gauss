package main;

import java.io.IOException;

import outputs.Bluetooth;
import outputs.FileOutput;
import outputs.Internet;
import outputs.decorators.CountSendCharacters;
import outputs.decorators.DeleteSpaces;
import outputs.decorators.Encryption;
import outputs.decorators.Normalize;

public class Main {
	private static String IP = "156.17.11.196";
	private static String BLUETOOTH = "Galaxy de Raúl";

	public static void main(String[] args) throws IOException {
		FileSystem system = new FileSystem();

		system.copyFile("privado.txt", new Internet(IP));
		system.copyFile("privado.txt", new Bluetooth(BLUETOOTH));
		system.copyFile("privado.txt", new FileOutput("sinAmpliacion.txt"));

		// Diseño de referencia
		system.copyFile("privado.txt",
				new Normalize(new FileOutput("copiaNormalizada.txt")));
		system.copyFile("privado.txt", new Encryption(new Internet(IP), true));
		system.copyFile("privado.txt", new Encryption(
				new DeleteSpaces(new Bluetooth(BLUETOOTH)), true));

		// Ampliacion 1
		system.copyFile("privado.txt", new Encryption(
				new Normalize(new FileOutput("copiaEncriptada.txt")), true));
		system.copyFile("privado.txt", new Encryption(
				new Normalize(new FileOutput("copiaSinEncriptar.txt")), false));

		// Ampliación 2
		system.copyFile("privado.txt",
				new Normalize(new DeleteSpaces(new Internet(BLUETOOTH))));
		system.copyFile("privado.txt", new Normalize(new Internet(BLUETOOTH)));

		// Ampliacion 3
		system.copyFile("privado.txt", new CountSendCharacters(new Internet(IP)));
		system.copyFile("privado.txt",
				new CountSendCharacters(new Bluetooth(BLUETOOTH)));
		system.copyFile("privado.txt",
				new CountSendCharacters(new FileOutput("sinAmpliacion.txt")));
	}

}
