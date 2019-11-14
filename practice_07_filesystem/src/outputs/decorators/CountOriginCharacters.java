package outputs.decorators;

import outputs.Output;

public class CountOriginCharacters implements Output {
	private Output output;
	private int count;

	public CountOriginCharacters(Output output) {
		this.output = output;
		this.count = 0;
	}

	@Override
	public void send(char c) {
		this.count++;
		output.send(c);
	}

	@Override
	public void close() {
		output.close();
		System.out.println("Se han enviado " + count + " caracteres");
	}
}
