package Click;

public class DateTracker extends Date implements DateInterface{
	private static int month;
	private static int day;
	
public DateTracker() {
	super(month, day);
}
	public void addMonth() {
		month = super.getMonth()+1;
		super.setMonth(month);
	}
	public void addDay() {
		day = super.getMonth()+1;
		if(day > 30) {
			month = month+1;
			super.setMonth(month);
			day = 0;
		}
		super.setDay(day);
	}
}

