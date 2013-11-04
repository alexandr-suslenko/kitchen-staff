package components;

public class Socket {
	private Power power;
	public Socket(){
		power = new Power();
	}
	public int getVoltage(){
		return power.getVoltage();
	}
	public int getCurrrent(){
		return power.getCurrent();
	}
	public Power getPower(){
		return power;
	}
	public String toString(){
		return power.toString();
	}
}
