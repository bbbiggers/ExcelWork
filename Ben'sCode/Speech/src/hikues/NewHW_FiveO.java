package hikues;

import java.util.Scanner;

public class NewHW_FiveO {

	public static void main(String[] args) {
		int data = 1;
		int count = 0; 
		int tot = 0;
		Scanner userInput = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println("Enter non-Zero Numbers until out want to find out about something.");
		System.out.println("Numbers:");
	while(data != 0) {
		//Getting Numb
		
		data = userInput.nextInt();
		
		if(data > max) {
			max = data;
		}
		
		if(data < min) {
			min = data;
		}
		
		count = count+1;
		tot = tot+data;
	}

	System.out.println("what would you like to find out about your numbers?");
	System.out.println("(Max, Min, Range, or Average)");
	userInput.nextLine();
	String whatDo = userInput.nextLine();
	//TESTER
	if(whatDo.equals("Max") || whatDo.equals("max")){
		System.out.println("Your Max is: "+max);
		System.out.println("Shutting Down!");
	}
	else if(whatDo.equals("Min") || whatDo.equals("min")){
		System.out.println("Your Max is: "+min);
		System.out.println("Shutting Down!");
	}
	else if(whatDo.equals("Range") || whatDo.equals("range")){
		System.out.println("Your range is "+min+" To "+max);
		System.out.println("Shutting Down!");
	}
	else if(whatDo.equals("Average") || whatDo.equals("average")){
		int avg = tot/count;
		System.out.println("Your average of all of them is "+avg+".");
		System.out.println("Shutting Down!");
	}
	else {
		System.out.println("Shutting Down! (Fatal Crash)");
	}

}}