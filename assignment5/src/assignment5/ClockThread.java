package assignment5;

import java.util.Calendar;



public class ClockThread extends Thread implements Runnable{
	public boolean running = true;
	private ClockInterface clockInterface;
	private Calendar calendar;
	

	public  ClockThread(ClockInterface ci){
		this.clockInterface = ci;
}
	public void run(){
	
		while (running == true){  // oänlig
			try {
				Calendar cal=calendar.getInstance();
				System.out.println(cal.get(11)+":"+cal.get(12)+":"+cal.get(13));
				clockInterface.update(cal.get(11), cal.get(12), cal.get(13));
				Thread.sleep(999);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//public 
		}
	
		}		
	}


