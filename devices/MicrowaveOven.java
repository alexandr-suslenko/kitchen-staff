package devices;

import components.*;
import foods.*;
import enumerations.*;

/**
 * @author Suslenko Alexandr
 */
public class MicrowaveOven {
	private Cable cable;
	private Plug plug;
	private LED led;
	private Magnetron heater;
	private Timer timer;
	private Shell shell;
	private Foods[] foods;
	private Power power;
	private float volume = 0;   // in liters
		
	public MicrowaveOven(int power){
		volume  = 30;
		cable = new Cable(2);
		plug = new Plug(PlugType.EURO);
		led = new LED(Color.GREEN);
		heater = new Magnetron(power, 2450000);
		shell = new Shell(200, 200, 200);
		timer = new Timer(0);
	}
	public MicrowaveOven(int power, Color ledColor, int width, int height, int length){
		volume  = 30;
		cable = new Cable(2);
		plug = new Plug(PlugType.EURO);
		led = new LED(ledColor);
		heater = new Magnetron(power, 2450000);
		shell = new Shell(width, height, length);
		timer = new Timer(0);
	}
	public void place(Foods[] foods){
		this.foods = foods;
	}
	public void plugIn(Socket socket){
		this.power = cable.conductPower(plug.plugIn(socket));
	}
	public void setTimer(int duration){
		if (duration <= 0) System.out.println("Please input correct time interval");
		timer.setTimer(duration);
		turnOn();
	}
	public void turnOn(){
		led.light();
		heatUp();
	}
	
	public Foods[] heatUp(){
		int duration = timer.getRemainingTime();
		while (!timer.countdown()){}
		for(Foods food: foods){
			float temperature = food.heatUp(heater.powerToHeatTransform(power), duration);
			System.out.println("The " + food.getName() + " has been heated up to temperature of " + temperature + " Celsius degrees");
		}
		return foods;
	}
	
	public String toString(){
		return "The volume of this microwave oven is " + volume + " liters";
	}
	
}
