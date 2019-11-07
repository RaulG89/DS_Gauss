package scooter.state;

import scooter.Scooter;

public class ModeLowBattery extends DefaultMode {

	public ModeLowBattery(Scooter scooter) {
		super(scooter);
	}

	@Override
	public void checkBatteryLevel() {
		if (scooter.getBattery().isEmpty()) {
			scooter.getDisplay()
					.alert("Se agotó la batería: el patinete va a apagarse...");
			showDisplay();
			turnOff();
			scooter.setMode(Mode.OFF);
		}
	}

	@Override
	public void showDisplay() {
		String drivingMode = "LOW";

		scooter.getDisplay().show(scooter.getSpeed(), scooter.getDistance(),
				scooter.getElapsedTime(), drivingMode,
				scooter.getLight().isOn(), scooter.getBatteryLevel());
	}
}
