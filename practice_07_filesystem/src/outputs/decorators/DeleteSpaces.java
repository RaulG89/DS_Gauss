package outputs.decorators;

import outputs.Output;

public class DeleteSpaces implements Output {

	private Output output;

	public DeleteSpaces(Output output) {
		this.output = output;
	}

	@Override
	public void send(char c) {
		if (c == ' ') {
			return;
		}
		output.send(c);
	}

	@Override
	public void close() {
		output.close();
	}

}
