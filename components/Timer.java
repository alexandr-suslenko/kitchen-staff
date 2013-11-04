package components;

import java.util.concurrent.TimeUnit;

public class Timer {
	private int remainingTime = 0;
	
	public int getRemainingTime() {
		return remainingTime;
	}
	
	public Timer(int duration){
		remainingTime = duration;
	}
	
	public void setTimer(int duration){
		remainingTime = duration;
	}
	public boolean countdown(){
		while(remainingTime!=0){
			try {
				TimeUnit.SECONDS.sleep(1);
				remainingTime --;
			}
			catch (InterruptedException e){
					
			}	
		}
		return true;
	}
	

}
