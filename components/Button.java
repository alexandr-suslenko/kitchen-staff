package components;

import  enumerations.*;

public class Button {
	private String color = Color.RED.toString();
	private boolean isEnabled = false;
	
	public Button(Color color){
		this.color = color.toString();
	}
	public boolean turnOn(){
		isEnabled = true;
		return isEnabled;
	}
	public boolean turnOff(){
		isEnabled = false;
		return isEnabled;
	}
	
	public String toString(){
		return "This button is " + color;
	}

}
