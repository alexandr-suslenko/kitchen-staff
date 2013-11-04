package components;

public class Heater {
	private int power = 0;
	private boolean isOn = false;
	
	public Heater(int power){
		this.power = power;
		isOn = false;
	}
	
	public int powerToHeatTransform(Power power){
		isOn =  true;
		return power.getPower() < this.power ? power.getPower() : this.power;	
	}
	
	public boolean getState(){
		return isOn;
	}
}
