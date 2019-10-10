import validators.ValidatorPredefined;

public class CampoPredefinido extends AbstractInput {

	public CampoPredefinido(String etiqueta, String... valores) {
		super(etiqueta);
		this.validator = new ValidatorPredefined(valores);
	}

}
