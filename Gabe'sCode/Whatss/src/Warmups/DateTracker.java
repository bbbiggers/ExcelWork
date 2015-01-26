package Warmups;

public class DateTracker extends ABstractClassWarmup implements DateInterface{


private int month;
private int day;
	
	
	
	//public DateTracker(){
	//super(m, d);
//}
public void addMonth(){
	month = super.getMonth()+1;
	super.setMonth(month);
}
public void addDay(){
	day = super.getDay()+1;
	super.setDay(day);
}

}
