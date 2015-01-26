package hikues;

import java.util.Scanner;

public class GreaterLessthan {
	
	public static void main (String[] args) {
		int Clock = 1;
		while(Clock == 1) {
			Clock = 0;
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Whould you like to know the Greatest or the smallest?");
		System.out.println("(g or s)");
		System.out.println("For more options enter \"o\"");
		String UpDown = userInput.nextLine();
		
		//Greater ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		if(UpDown.equals("g")) {
		
			System.out.println("enter a none zero number or enter Zero to find the sum of all!");
			int thingling = 1;
			int max = -1000000000;
			
			
			while(thingling != 0){
				thingling = userInput.nextInt();
				if(thingling >= max) {
					max = thingling;
				}
				else {
					max = max;
				}
			}
		
			System.out.println("You max is: "+max);
		}
		//Less Than ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		else if(UpDown.equals("s")) {
			
			System.out.println("enter a none zero number or enter Zero to find the sum of all!");
			int thingling = 1;
			int max = 1000000000;

			while(thingling != 0){
				thingling = userInput.nextInt();
				if(thingling <= max) {
					max = thingling;
				}
				else {
					max = max;
				}
			}
		
			System.out.println("You Minumum is: "+max);
		}
		
		//More Options ::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::
		else if(UpDown.equals("o")) {
			System.out.println("Whould you like to know the range or the Average?");
			System.out.println("(r or a)");
			System.out.println("Enter \"o\" to go back");
			String Newrer = userInput.nextLine();
			
			if(UpDown.equals("r")) {
				
				System.out.println("enter a none zero number or enter Zero to find the sum of all!");
				int thingling = 1;
				int max = 1000000000;

				while(thingling != 0){
					thingling = userInput.nextInt();
					if(thingling <= max) {
						max = thingling;
					}
					else {
						max = max;
					}
				}
			}
				System.out.println("You Minumum is: "+max);
			}
			
			else if(UpDown.equals("a")) {
				
				System.out.println("enter a none zero number or enter Zero to find the sum of all!");
				int thingling = 1;
				int max = 1000000000;

				while(thingling != 0){
					thingling = userInput.nextInt();
					if(thingling <= max) {
						max = thingling;
					}
					else {
						max = max;
					}
				}
			}
			else if(UpDown.equals("o")) {
					
				
				}
			
				System.out.println("You Minumum is: "+max);
			}

		}
		else {
			System.out.println("g or s");
			Clock = 0;
		}
		}
		
	}

