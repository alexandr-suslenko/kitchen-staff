package components;

public class Power {
	private int voltage = 220;
	private int current = 16;
	
	private int power = voltage*current;
	public Power(){
		voltage = 220;
		current = 16;
		power = voltage*current;
	}	
	public Power(int voltage, int current){
		this.voltage = voltage;
		this.current = current;
	}
	public int getVoltage(){
		return voltage;
	}
	public void setVoltage(int voltage){
		this.voltage = voltage;
	}
	public int getCurrent(){
		return current;
	}
	public void setCurrent(int current){
		this.current = current;
	}
	public int getPower(){
		return power;
	}
	public String toString(){
		return "Power voltage is " + 220 + " and capable to provide " + current + " amperes";
	}
}
