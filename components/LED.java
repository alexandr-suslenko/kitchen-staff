package components;

import enumerations.*;

public class LED {
	private String color = Color.GREEN.toString();
	private boolean isOn = false;
	
	public LED(Color color){
		this.color = color.toString();
	}
	
	public void light(){
		isOn = true;
	}
	public void turnOut(){
		isOn = false;
	}
	public boolean getState(){
		return isOn;
	}
	public String toString(){
		return "This LED is " + color;
	}
}
