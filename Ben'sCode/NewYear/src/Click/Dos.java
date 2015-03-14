package NewYear.src.Click;

import java.util.Scanner;

public class Dos {
	public static void main(String[] args) {
		Scanner POP = new Scanner(System.in);
		
		String data = POP.nextLine();
		String month = data.substring(0,1);
		String day = data.substring(3,4);
		String year = data.substring(6);
		/*
		01 January
		02 February
		03 March
		04 April
		05 May
		06 June
		07 July
		08 August
		09 September
		10 October
		11 November
		12 December 
	*/
		if(month.equals("01")) {
			month = "January";

		}
		else if(month.equals("02")) {
			month = "February";

		}
		else if(month.equals("03")) {
			month = "March";

		}
		else if(month.equals("04")) {
			month = "April";

		}
		else if(month.equals("05")) {
			month = "May";

		}
		else if(month.equals("06")) {
			month = "June";

		}
		else if(month.equals("07")) {
			month = "July";

		}
		else if(month.equals("08")) {
			month = "August";

		}
		else if(month.equals("09")) {
			month = "September";

		}
		else if(month.equals("10")) {
			month = "October";

		}
		else if(month.equals("11")) {
			month = "November";
		}
		else if(month.equals("12")) {
			month = "December";
		}
		else{
			month = "pop";
		}
		
		System.out.println(month+" "+day+", "+year);
	}
}
