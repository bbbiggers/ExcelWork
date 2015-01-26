package Warmups;

public abstract class ABstractClassWarmup {

private int month;	
private int day;		
/*	
	public ABstractClassWarmup(int m,int d){
		month =m;
		day =d;
	}
*/
public int getDay(){
	return day;
}
public int getMonth(){
	return month;
}public void setDay(int d){
	day=d;
}
public void setMonth(int m){
	month = m;
}
public abstract void addMonth();
	
}
