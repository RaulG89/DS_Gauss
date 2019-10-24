package scooter.state;

import scooter.Scooter;

public class ModeDrive extends DefaultMode {

	public ModeDrive(Scooter scooter) {
		super(scooter);
	}

	@Override
	public void checkBatteryLevel() {
		if (scooter.getBattery().isEmpty()) {
			scooter.getDisplay()
					.alert("Se agotó la batería: el patinete va a apagarse...");
			// muestra el estado actual del patinete justo antes de apagarse
			showDisplay();
			// se apaga el patinete
			turnOff();
			scooter.setMode(Mode.OFF);
		} else if (scooter.getBattery().isLow()) {
			scooter.getDisplay().alert("Cambiando al modo de batería baja...");
			scooter.getMotor().setMaximumSpeed(5);
			scooter.setMode(Mode.LOW_BATTERY);
		}
	}

	@Override
	public void showDisplay() {
		String drivingMode = "D";

		scooter.getDisplay().show(scooter.getSpeed(), scooter.getDistance(),
				scooter.getElapsedTime(), drivingMode,
				scooter.getLight().isOn(), scooter.getBatteryLevel());

	}

}
