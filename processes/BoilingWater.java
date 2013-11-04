package processes;

import components.*;
import devices.Kettle;
import foods.Water;

/**
 * @author Suslenko Alexandr
 */
public class BoilingWater {
	
	private Socket socket;	
	private Water water;
	private Kettle kettle;
	
	BoilingWater(float waterVolume, float initialTemperature, float kettleVolume){
		socket = new Socket();	
		water = new Water(waterVolume, initialTemperature);
		kettle = new Kettle(kettleVolume);
	}
	
	public void boilWater(){
		kettle.fill(water);
		kettle.plugIn(socket);
		kettle.turnIn();
	}
}
