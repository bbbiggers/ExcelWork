package Spread;

import java.util.Scanner;

public class TextExcel {
	

	public static void main(String[] args) {
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
		} else if((Exit.substring(0, 5)).equals("clear") || (Exit.substring(0, 5)).equals("Clear")){
			String A = Exit.substring(6, 7);
			String B = Exit.substring(7);
			System.out.println(A+" "+B);
			
		}
		}
	}
}