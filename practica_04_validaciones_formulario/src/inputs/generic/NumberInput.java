import validators.ValidatorNumber;

public class CampoNumero extends AbstractInput {

	public CampoNumero(String etiqueta) {
		super(etiqueta);
		this.validator = new ValidatorNumber();
	}

}
