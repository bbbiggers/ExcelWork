package calc;

import java.util.Scanner;

public class CarrotsAndMilk {
	public static void main(String[] args) {
		String item1 = "Carrots";
		String item2 = "Milk";
		String item3 = "Cheese";

		double price1 = 3.99;
		double price2 = 2.37;
		double price3 = 6.79;
		
		int CHECLER = 23;
		Scanner userInput = new Scanner(System.in);
		while(CHECLER == 2) {
			//START  OF WHILE
		System.out.println("I got "+item1+" for $"+price1+", "+item2+" for $"+price2+" and "+item3+" for $"+price3+".");
		System.out.println("Would you like to purchase items or Employee Overide: \n(Yes or E)");
		
		String answ = userInput.nextLine();
		if(answ.equals("")) {
			
			
			
		}
		else if(!answ.equals("")) {
			
		}
		else {
			System.out.println("Error has Occured");

		}
		
		
		
		
		
		}
	}	
}
