package model.mineStrategy;

public class Mine {
	private double valueGeneratePerHour;

	public Mine(double valueGenerate) {
		this.valueGeneratePerHour = valueGenerate;
	}

	public double generateCoinsPerDay() {
		return valueGeneratePerHour * 24;
	}
}
