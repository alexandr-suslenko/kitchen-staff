package devices;

import java.util.concurrent.TimeUnit;

import components.*;
import foods.*;
import enumerations.*;

/**
 * @author Suslenko Alexandr
 */
public class Kettle {
	private Button button;
	private LED led;
	private Heater heater;
	private Thermostat thermostat;
	private Holder holder;
	private Shell shell;
	private Water water;
	private Power power;
		
	private float volume = 0;   // in liters
	private boolean isBoiling = false;
	
	// volume in liters
	public Kettle(float volume){
		this.volume = volume;
		button = new Button(Color.RED);
		led = new LED(Color.GREEN);
		heater = new Heater(2000);
		thermostat = new Thermostat(100);
		holder = new Holder(180);
		shell = new Shell(180, 250);
	}
	public Kettle(float volume, Color color, Color ledColor, int heaterPower, float threshold, int holderDiameter){
		this.volume = volume;
		button = new Button(color);
		led = new LED(ledColor);
		heater = new Heater(heaterPower);
		thermostat = new Thermostat(threshold);
		holder = new Holder(holderDiameter);
		shell = new Shell(180, 250);
	}
	
	private boolean isOverPoured(float volume){
		return this.volume < volume;		
	}
	private boolean isEmpty(float volume){
		return volume == 0;
	}
	
	public void fill(Water water){
		if (!isOverPoured(water.getVolume())&&(!isEmpty(water.getVolume()))){
			this.water = water;
		}
		else System.out.println("Please check water level");
	}
	
	public void plugIn(Socket socket){
		this.power = holder.providePower(socket);
	}
	
	public void turnIn(){
		button.turnOn();
		led.light();
		boilWater();
	}
	
	public Water boilWater(){
		while(!isBoiling){
			try {
				TimeUnit.SECONDS.sleep(1);
				if(thermostat.checkTemperature(water.heatUp(heater.powerToHeatTransform(power), 1))) isBoiling = true;
			}
			catch (InterruptedException e){
			}
		}
		System.out.println("The water has been boiled");
		return water;
	}
	
	public String toString(){
		return "The volume of this kettle is " + volume + " liters";
	}
	
}
