package outputs;

import java.io.*;

public class Internet implements Output {
	public Internet(String url) {
		stringWriter = new StringWriter();
		stringWriter.append("\n--- START Internet [" + url + "]\n");
	}

	public void send(char c) {
		stringWriter.append(c);
	}

	public void close() {
		System.out.print(stringWriter.toString());
		System.out.println("\n--- END   Internet");
	}

	private StringWriter stringWriter = new StringWriter();
}
