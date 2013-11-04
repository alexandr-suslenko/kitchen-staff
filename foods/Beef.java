package foods;

public class Beef implements Foods {
	static final float BEEF_SP_HEAT;
	static{
		BEEF_SP_HEAT = 2.76f;
	}
	private float weight = 0;    // in kg
	private float temperature = 0;
	public Beef(float weight, float initialTemperature){
		this.weight = weight;    // in kg
		temperature = initialTemperature; 
	}
	
	// duration must be in seconds
	public float heatUp(int power, float duration){
		if (weight <= 0.0f) System.out.println("Change the beaf weight, it cannot equal to zero o less");
		else temperature +=power*duration/(1000*weight*BEEF_SP_HEAT);
		return temperature;
	}
	
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	public String getName(){
		return "beef";
	}
}

