package components;

import enumerations.*;

public class Holder {
	private int diameter = 0;
	private Cable cable;
	private Plug plug;
	
	public Holder(int diameter){
		this.setDiameter(diameter);
		cable = new Cable(2);
		plug = new Plug(PlugType.EURO);
	}
	
	public Holder(int diameter, int cableLength, PlugType type){
		this.setDiameter(diameter);
		cable = new Cable(cableLength);
		plug = new Plug(type);
	}
	
	public Power providePower(Socket socket){
		return cable.conductPower(plug.plugIn(socket));
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
}
