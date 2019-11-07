package scooter.state;

import scooter.Scooter;

public abstract class DefaultMode implements ModeState {

	protected Scooter scooter;

	public DefaultMode(Scooter scooter) {
		this.scooter = scooter;
	}

	@Override
	public void advanceOneMinute() {
		scooter.getMotor().updateComsumption(1);
		scooter.setElapsedTime(scooter.getElapsedTime() + 1);
		double distance = (double) scooter.getMotor().getSpeed() * 1000 / 60;
		scooter.setDistance(scooter.getDistance() + distance);
		checkBatteryLevel();
	}

	@Override
	public void checkBatteryLevel() {
		System.out.println("Este método está pensado para ser llamado"
				+ " sólo cuando el patinete está en marcha");
	}

	@Override
	public void pressPowerButton() {
		if (scooter.getLight().isOn())
			scooter.getLight().turnOff();
		else
			scooter.getLight().turnOn();
	}

	@Override
	public void longPressPowerButton() {
		if (scooter.getMotor().getSpeed() > 0) {
			scooter.getDisplay().alert(
					"No se puede apagar el patinete estando en movimiento");
			return;
		}
		turnOff();
	}

	@Override
	public void turnAccelerator(int amount) {
		scooter.getMotor().accelerate(amount);
	}

	@Override
	public void plugPowerAdapter() {
		scooter.getDisplay().alert("¡Apague el patinete para poder cargarlo!");
		return;
	}

	@Override
	public void unplugPowerAdapter() {
		throw new IllegalStateException(
				"¡¿Cómo se va a desenchufar sin estar enchufado?!");
	}

	@Override
	public void showDisplay() {
	}

	// -- Métodos privados para la inicialización y encendido y apagado de
	// los componentes cada vez que se enciende o apaga el patinete

	protected void turnOn() {
		scooter.setElapsedTime(0);
		scooter.setDistance(0);
		scooter.getMotor().turnOn();
	}

	protected void turnOff() {
		scooter.getLight().turnOff();
		scooter.getMotor().turnOff();
	}

}
