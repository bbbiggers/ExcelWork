package Spread;

import java.util.Scanner;

public class TextExcel{
	

	public static void main(String[] args) {
		int helper = 0;
		String[][] Sheet = new String[10][7];
	
		Scanner Imput = new Scanner(System.in);
		Spreadsheet Shet = new Spreadsheet(Sheet);
		Shet.clearall();
		String Exit = "NO"; 
		while(!Exit.equals("exit")){
		System.out.println("enter a command:");
		Exit = Imput.nextLine();
		//System.out.println(Exit.substring(0, 5));
		if(Exit.equals("print")||Exit.equals("Print")) {
			Shet.printSheet();
		}
		else if(Exit.equals("clear all")||Exit.equals("Clear All")||Exit.equals("Clear all")||Exit.equals("clear All")) {
			Shet.clearall();
		}
		else if(Exit.equals("help")||Exit.equals("Help")) {
			
			if(helper == 0) {
			System.out.println("When in Doubt take the spaces Out");
			System.out.println("To Clear All type\"Clear All\"");
			System.out.println("To Add type\"Add\"");
			System.out.println("To Clear type \"Clear\"and the location \"A1\"");
			System.out.println("For more help type \"Help\"");
			}
			else if(helper == 1) {
				System.out.println("**!EXTRA HELP!**");
				System.out.println("Just type\"Clear All\" To CLEAR!");
				System.out.println("To Add type\"Add\" <--- Add things here");
				System.out.println("To Clear type \"Clear\"and the location \"A1\"");
				System.out.println("For more help type \"Help\"");
			}
			else if(helper > 1) {
				System.out.println("Sorry,\nBut the General Manager\nhas Anounced that we are\nClosing Down!");
			}
			helper++;
		}
		else if(Exit.length() > 1){ //Changed to 2 from 5
			System.out.println("Check Mark TO DO");
			if(Exit.contains("clear") || Exit.contains("Clear")) {
			String A = Exit.substring(6, 7);
			String B = Exit.substring(7);
			int a = 0;
			int b = Integer.parseInt(B);
			a = Shet.AtoB(A);
			if(b < 11 && a < 8 && a > 0 && b > 0) {
			Shet.clear(b, a);
			}
			else {
				System.out.println("Not a valid point!");
			}
			}
			else {
				System.out.println("Check Mark");
				Shet.Decipher(Exit);
				
				//Shet.printOut();
			}
		}

		else if(Exit.equals("Exit") || Exit.equals("Exit")) {
			Exit = "exit";
		}
		else {
			
			//System.out.println("That is Bad.");
		}

		}
		}
	}
