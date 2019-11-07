package scooter;

import java.util.HashMap;
import java.util.Map;

import scooter.components.Battery;
import scooter.components.Display;
import scooter.components.Light;
import scooter.components.Motor;
import scooter.state.Mode;
import scooter.state.ModeCharging;
import scooter.state.ModeDrive;
import scooter.state.ModeLowBattery;
import scooter.state.ModeOff;
import scooter.state.ModeState;

public class Scooter {
	private static final boolean DEBUG = true;
	private Map<Mode, ModeState> map;

	// -- Los componentes internos del patinete
	private Display display = new Display();
	private Battery battery = new Battery();
	private Motor motor = new Motor(battery);
	private Light light = new Light();

	// El tiempo transcurrido y la distancia recorrida desde que se puso en
	// marcha (es decir, desde la última vez que se encendió)
	private int elapsedTime; // en minutos
	private double distance; // en metros

	private ModeState mode;

	public Scooter() {
		this.map = new HashMap<Mode, ModeState>();
		this.map.put(Mode.CHARGING, new ModeCharging(this));
		this.map.put(Mode.OFF, new ModeOff(this));
		this.map.put(Mode.LOW_BATTERY, new ModeLowBattery(this));
		this.map.put(Mode.DRIVE, new ModeDrive(this));
		setMode(Mode.OFF);
	}

	// Simula el paso del tiempo, en minutos. Si el patinete está en marcha
	// lo hace mediante una serie de incrementos sucesivos, de minuto en minuto,
	// para que se puedan hacer comprobaciones intermedias y cambiar de modo si
	// es necesario (por ejemplo, cuando la carga de la batería baja de un
	// cierto
	// nivel o si llega a agotarse por completo antes de finalizar el lapso de
	// tiempo indicado).
	//
	// NOTA: Se recomienda dejar este método en esta clase como está para que
	// ==== funcione correctamente, y cambiar sólo lo necesario en el método
	// advanceOneMinute(), que es el que depende del modo actual
	//
	public void simulateAdvanceTime(int elapsedTime) {
		for (int i = 0; i < elapsedTime; i++) {
			advanceOneMinute(); // incrementos de minuto en minuto
		}
		// después de haber transcurrido el tiempo indicado se actualiza el
		// visor para que muestre información del estado actual del patinete
		showDisplay();
	}

	// -- Cambio de modo
	// ------------------------------------------------------------------------

	public void setMode(Mode mode) {
		// sólo para depuración, no tiene utilidad práctica
		modeChanged(mode);

		this.mode = this.map.get(mode);

		// cada vez que se cambia el modo se actualiza la información de la
		// pantalla
		showDisplay();
	}

	// -- MÉTODOS DEPENDIENTES DE CADA MODO
	// -------------------------------------------------------------------------

	// Simula que ha transcurrido un minuto. Dependiendo del modo hace una cosa
	// u otra: si está cargando, recargar la batería el equivalente a estar un
	// minuto enchufada; si está en marcha, actualizar el consumo de la batería
	// y la distancia recorridas a la velocidad actual en un minuto, y comprobar
	// al pasar ese minuto el estado de la batería para ver si hay que cambiar a
	// modo de batería baja (velocidad reducida) o apagar el patinete si se
	// agota por completo; etcétera (otros modos nuevos podrían requerir
	// distintas
	// acciones).
	//
	private void advanceOneMinute() {
		mode.advanceOneMinute();
	}

	// -- Eventos asociados a las distintas pulsaciones del botón de encendido
	// (pulsación normal, larga o doble, respectivamente)

	public void pressPowerButton() {
		mode.pressPowerButton();
	}

	public void longPressPowerButton() {
		mode.longPressPowerButton();
	}

	public void doublePressPowerButton() {
		// Ahora mismo no hace nada
	}

	// -- Indica que se ha girado el acelerador y cuánto (expresado como el
	// porcentaje de giro, que debe ser por tanto un número entre 0 y 100,
	// donde cero detiene el patinete y cien lo pone a su velocidad máxima
	// actual, dependiendo del modo de conducción actual y del nivel de
	// carga de la batería).

	public void turnAccelerator(int amount) {
		mode.turnAccelerator(amount);
	}

	// -- Enchufar y desenchufar el patinete a la red eléctrica para cargarlo

	public void plugPowerAdapter() {
		mode.plugPowerAdapter();
	}

	public void unplugPowerAdapter() {
		mode.unplugPowerAdapter();
	}

	// -- Actualiza la información mostrada en la pantalla, dependiendo del modo
	public void showDisplay() {
		mode.showDisplay();
	}

	// -- Métodos públicos de acceso al estado interno del patinete
	// ------------------------------------------------------------

	public int getSpeed() {
		return motor.getSpeed();
	}

	public double getDistance() {
		return distance;
	}

	public int getElapsedTime() {
		return elapsedTime;
	}

	public double getBatteryLevel() {
		return battery.getLevel();
	}

	public boolean isLightOn() {
		return light.isOn();
	}

	// -- Métodos para depuración
	// --------------------------

	// Si está activada la constante DEBUG muestra por consola un mensaje cada
	// vez que se pasa de un modo a otro; sirve sólo para depuración
	private void modeChanged(Mode mode) {
		switch (mode) {
		case CHARGING:
			debug("Patinete cargando");
			break;
		case OFF:
			debug("Patinete apagado");
			break;
		case LOW_BATTERY:
			debug("Se cambió al modo de batería baja");
			break;
		case DRIVE:
			debug("Se cambió al modo de conducción normal (D)");
			break;
		}
	}

	private void debug(String message) {
		if (!DEBUG)
			return;
		System.out.printf("  >> %s%n", message);
	}

	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append(String.format("Patinete en modo %s%n", mode));
		result.append(light + System.lineSeparator());
		result.append(motor + System.lineSeparator());
		result.append(battery);
		return result.toString();
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}

	public static boolean isDebug() {
		return DEBUG;
	}

	public void setElapsedTime(int elapsedTime) {
		this.elapsedTime = elapsedTime;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

}
