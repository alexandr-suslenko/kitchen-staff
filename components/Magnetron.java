package components;

public class Magnetron extends Heater{
	private long frequency = 2450000;
	public Magnetron(int power, long frequency){
		super(power);
		this.frequency = frequency;
	}
	
	public long getFrequency(){
		return frequency;
	}
}
