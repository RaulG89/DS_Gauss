package outputs.decorators;

import outputs.Output;

public class Normalize implements Output {

	private Output output;

	public Normalize(Output output) {
		this.output = output;
	}

	@Override
	public void send(char c) {
		if (c == '\r') {
			return;
		}
		output.send(c);
	}

	@Override
	public void close() {
		output.close();
	}

}
