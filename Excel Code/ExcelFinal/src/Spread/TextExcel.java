package Spread;

import java.util.Scanner;

public class TextExcel{
	private static boolean Testing = false;
	

	public static void main(String[] args) {
		int helper = 0;
		String[][] Sheet = new String[10][7];
		Scanner Imput = new Scanner(System.in);
		Spreadsheet Shet = new Spreadsheet(Sheet);
		Shet.clearall();
		String Exit = "NO"; 
		while(!Exit.equals("exit") || !Exit.equals("Exit")){
		System.out.println("enter a command:");
		Exit = Imput.nextLine();
		//System.out.println(Exit.substring(0, 5));
		if(Exit.equals("print")||Exit.equals("Print")) {
			Shet.printSheet();
		}
		else if(Exit.equals("clear all")||Exit.equals("Clear All")||Exit.equals("Clear all")||Exit.equals("clear All")) {
			Shet.clearall();
		}
		else if(Exit.contains("help")||Exit.contains("Help")) {
			if(Exit.contains("clear") || Exit.contains("Clear")) {
				System.out.println("To Clear All type\"Clear All\"");
				System.out.println("To Clear type\"clear Location\"");
			}
			else if(Exit.contains("operations") || Exit.contains("Operations")) {
				System.out.println("To subtract type \"Location = ( Number or Location - Number or Location )\"");
				System.out.println("To add type \"Location = ( Number or Location + Number or Location )\"");
				System.out.println("To divide type \"Location = ( Number or Location / Number or Location )\"");
				System.out.println("To multiply type \"Location = ( Number or Location * Number or Location )\"");	
				System.out.println("You can use as many operations as you like");
			}
			else if(Exit.contains("sum/average") || Exit.contains("Sum/Average") || Exit.contains("sum/Average") || Exit.contains("Sum/average")) {
				System.out.println("To find the Sum a range of cells from a top-left corner to a bottom-right corner");
				System.out.println("Type \"Location = ( sum Location1 - Location2 )\"");
				System.out.println("To find the Average a range of cells from a top-left corner to a bottom-right corner");
				System.out.println("Type \"Location = ( avg Location1 - Location2 )\"");
			}
			else if(helper < 5) {
			System.out.println("For help on clearing type \"help clear\"");
			System.out.println("For help on Operations type \"help operations\"");
			System.out.println("For help on Sum or Average type \"help sum/average\"");
			System.out.println("For info on a single Cell Type it's \"Location\"");
			System.out.println("To print the entire SpreadSheet Type \"print\"");
			System.out.println("To exit Type \"exit\"");
			}
			else if(helper > 5) {
				System.out.println("Sorry,\nBut the General Manager\nhas Anounced that we are\nClosing Down!");
			}
			helper++;
		}
		else if(Exit.length() > 1){ //Changed to 2 from 5
			if(Testing) {System.out.println("Check Mark TO DO");}
			if(Exit.contains("clear") || Exit.contains("Clear")) {
			String A = Exit.substring(6, 7);
			String B = Exit.substring(7);
			int a = 0;
			int b = Integer.parseInt(B);
			a = Shet.AtoB(A);
			if(b < 11 && a < 8 && a >= 0 && b >= 0) {
			
				Shet.clear(b, a);
			}
			else {
				System.out.println("Not a valid point!");
			}
			}
			else {
				if(Testing) {System.out.println("Check Mark");}
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
