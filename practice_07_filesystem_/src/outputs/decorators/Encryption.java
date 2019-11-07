package outputs.decorators;

import outputs.Output;

public class Encryption implements Output {
	private Output output;
	private boolean encrypt;

	public Encryption(Output output, boolean encrypt) {
		this.output = output;
		this.encrypt = encrypt;
	}

	@Override
	public void send(char c) {
		if (encrypt && Character.isLetterOrDigit(c)) {
			c = (char) (c + 1);
		}
		output.send(c);
	}

	@Override
	public void close() {
		output.close();
	}

}
