package components;

import enumerations.*;

public class Cable {
	private int length = 0;
	private String color = Color.BLUE.toString();
	public Cable(int length){
		this.length = length;
	}
	
	public Power conductPower(Power power){
		return power;
	}
	public String toString(){
		return "This cable is " + color + " and " + length + " meters long"; 
	}
}
