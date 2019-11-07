package scooter.state;

public interface ModeState {
	void advanceOneMinute();

	void checkBatteryLevel();

	void pressPowerButton();

	void longPressPowerButton();

	void turnAccelerator(int amount);

	void plugPowerAdapter();

	void unplugPowerAdapter();

	void showDisplay();
}
