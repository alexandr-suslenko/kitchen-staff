package components;

public class Thermostat {
	private float thresholdTemperature = 100;
	public Thermostat(float threshold){
		thresholdTemperature = threshold;
	}
	
	public boolean checkTemperature(float temperature){
		return temperature > thresholdTemperature;
	}

}
