package FrogClass;

public class TIME {
private int hours;
private int minutes;


public TIME(int h,int m){
	
hours = h;
minutes = m;
	
	//return hours+":"+minutes;
	
}

public void addMinutes(int min){
	
minutes+=min;
while(minutes>=60){
minutes-=60;	
hours++;
if (hours > 12){
hours = 1;	
  }
 }
}
public String toString() {
	return hours+":"+minutes;
		
	}
	
	
	
}











