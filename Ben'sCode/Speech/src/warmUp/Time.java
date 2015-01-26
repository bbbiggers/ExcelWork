package warmUp;

public class Time {

	private int hours;
	private int minutes;
	private String form;
	
	public Time() {
		hours = 00;
		minutes = 00; 
	}
	
	public void addmin(int toAdd) {
		minutes = minutes+toAdd;
		if(minutes >= 60) {
			if(60-minutes == 0) {
				minutes = 0;
				hours = hours+1;
			}
			else if(60-minutes < 0) {
				minutes = minutes-60;
				hours = hours+1;
			}
			
		}
		if(hours == 13) {
			hours = 1;
		}
	}
	
	public String toString() {
		if(minutes < 10) {
			form = hours+":"+"0"+minutes;
			if(hours == 0) {
				form = "0"+form;
			}
		}
		else {
			form = hours+":"+minutes;
			if(hours == 0) {
				form = "0"+form;
			}
		}
	
		return form;
	}
	
}
