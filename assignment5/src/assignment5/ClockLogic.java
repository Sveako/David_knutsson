package assignment5;

public class ClockLogic implements ClockInterface {

	private DigitalClockGUI clockGUI;
	
	private int alarmHour;
	
	private int alarmMinute;
	
	
	public  ClockLogic(DigitalClockGUI clockIn){
		this.clockGUI = clockIn;
		Thread t = new Thread(new ClockThread(this));
		t.start();
	}
	
	
	public void setAlarm(int hour, int minute) {
		if (hour >= 24 || hour < 0) {
			System.out.println("fail");

		} else {
			System.out.println("succes");
			this.alarmHour = hour;

		}
			
			
			if( minute >= 60 || minute < 0){
				System.out.println("fail");
			}else{
				System.out.println("succes");
				this.alarmMinute = minute;
			}
			
			
			String alarmTid = String.format("       "  + "%02d", this.alarmHour) +" : " + String.format("%02d", alarmMinute);
			
			clockGUI.setAlarm(alarmTid);
			
			
		}
		
		public void clearAlarm(){
			this.alarmHour = 0;
			this.alarmMinute = 0;
			
			DigitalClockGUI.clear();
			
		}
	

		@Override
		public void update(int hour, int minute, int second) {
			clockGUI.Time.setText(String.format("     " + "%02d",hour)+":"+String.format("%02d",minute)+":"+String.format("%02d", second));	
	
		if(alarmHour==hour&& alarmMinute== minute){
			clockGUI.alarm(true);
		}else{
			clockGUI.alarm(false);
		}
		
		
		
		}
	}