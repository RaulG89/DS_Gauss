package scooter.state;

import scooter.Scooter;

public class ModeCharging extends DefaultMode {

	public ModeCharging(Scooter scooter) {
		super(scooter);
	}

	@Override
	public void advanceOneMinute() {
		this.scooter.getBattery().charge(0.196078431372549);
	}

	@Override
	public void pressPowerButton() {
	}

	@Override
	public void longPressPowerButton() {
	}

	@Override
	public void turnAccelerator(int amount) {
	}

	@Override
	public void plugPowerAdapter() {
		throw new IllegalStateException(
				"¡¿Cómo se va a recibir esta llamada si ya está enchufado?!");
	}

	@Override
	public void showDisplay() {
		scooter.getDisplay().charging(scooter.getBatteryLevel());
	}

}
