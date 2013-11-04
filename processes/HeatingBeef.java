package processes;

import components.*;
import devices.*;
import foods.*;

public class HeatingBeef {

	private Socket socket;	
	private Foods[] foods;
	private MicrowaveOven oven;
	
	HeatingBeef(float foodVolume, float initialTemperature, int power){
		socket = new Socket();	
		Foods[] foods = {new Beef(foodVolume, initialTemperature), new Beef(foodVolume+0.1f, initialTemperature+5)};
		this.foods = foods;
		oven = new MicrowaveOven(power);
	}
	
	public void heatUpBeef(int duration){
		oven.plugIn(socket);
		oven.place(foods);
		oven.setTimer(duration);
	}
}
