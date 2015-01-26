package calc;

import java.util.Scanner;

public class Test {
	//IN MAIN
public static void main(String[] args) {
	
	 Scanner Imput = new Scanner(System.in);
	 System.out.println("What was your order cost?");
	 double price = Imput.nextDouble();
	 System.out.println("from 1-5 how was your service?");
	 int rating = Imput.nextInt();
	double tip  = suggestedTip(rating, price);

	System.out.println("Your suggested tip is: "+tip);

	//IN SUGGESTED TIP       \/           \/               \/               \/
}
	public static double suggestedTip(int rating, double price) {

	//10% for 1-2 

	//15% for 3

	//20% for 4-5

	double TIP = 0;

	if(rating == 1 || rating == 2) {

	TIP = price*.1;

	return TIP;

	}

	else if(rating == 3) {

	TIP = price*.15;

	return TIP;

	}

	else if(rating == 4 || rating == 5) {

	TIP = price*.2;

	return TIP;

	}

	else {

	System.out.println("Sorry that's not a valid rating!");

	return -1;

	}











	}
}
