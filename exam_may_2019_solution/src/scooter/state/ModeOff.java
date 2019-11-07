package scooter.state;

import scooter.Scooter;

public class ModeOff extends DefaultMode {
	
	public ModeOff(Scooter scooter) {
		super(scooter);
	}

	@Override
	public void advanceOneMinute() {
	}

	@Override
	public void pressPowerButton() {
		if (scooter.getBattery().isEmpty()) {
			scooter.getDisplay()
					.alert("Batería insuficiente: cargue el patinete para "
							+ "poder encenderlo");
			return;
		}
		turnOn();
		if (scooter.getBattery().isLow()) {
			scooter.getMotor().setMaximumSpeed(5);
			scooter.setMode(Mode.LOW_BATTERY);
		} else {
			scooter.getMotor().setMaximumSpeed(25);
			scooter.setMode(Mode.DRIVE);
		}
	}

	@Override
	public void longPressPowerButton() {
	}

	@Override
	public void turnAccelerator(int amount) {
	}

	@Override
	public void plugPowerAdapter() {
		turnOff();
		scooter.setMode(Mode.CHARGING);
	}

	@Override
	public void showDisplay() {
		return;
	}

}
