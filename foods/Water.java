package foods;

public class Water implements Foods{
	static final float WATER_SP_HEAT;
	static{
		WATER_SP_HEAT = 4.1f;
	}
	private float volume = 0;    // in liters
	private float temperature = 0;
	public Water(float volume, float initialTemperature){
		this.volume = volume;    // in liters
		temperature = initialTemperature; 
	}
	
	// duration must be in seconds
	public float heatUp(int power, float duration){
		if (volume <= 0.0f) System.out.println("Change the volume of the water, it cannot be equal to zero or less");
		else temperature +=power*duration/(1000*volume*WATER_SP_HEAT);
		return temperature;
	}
	
	public float getVolume() {
		return volume;
	}

	public void setVolume(float volume) {
		this.volume = volume;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public String getName(){
		return "water";
	}
}
