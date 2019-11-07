package outputs.decorators;

import outputs.Output;

public class CountSendCharacters implements Output {
	private Output output;
	private int count;

	public CountSendCharacters(Output output) {
		this.output = output;
		this.count = 0;
	}

	@Override
	public void send(char c) {
		if (c == ' ' || c == '\r' || c == '\n') {
			this.count++;
		}
		output.send(c);
	}

	@Override
	public void close() {
		output.close();
		System.out.println("Se han enviado " + count + " caracteres");
	}
}
