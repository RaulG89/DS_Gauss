import validators.ValidatorText;

public class CampoTexto extends AbstractInput {

	public CampoTexto(String etiqueta) {
		super(etiqueta);
		this.validator = new ValidatorText();
	}

}
