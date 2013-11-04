package components;

import enumerations.*;

public class Plug {
	private String plugType = PlugType.EURO.toString();
	private boolean isPluged = false;
	public Plug(PlugType type){
		this.plugType = type.toString();
	}
	public Power plugIn(Socket socket){
		isPluged = true;
		return socket.getPower();
	}
	public void plugOut(){
		isPluged = false;
	}
	
	public boolean isPluged(){
		return isPluged; 
	}
	public String toString(){
		return "Plug type is " + plugType;
	}
}
