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
		if(Exit.equals("print")) {
			Shet.printSheet();
		}
		else if(Exit.equals("clear all")) {
			Shet.clearall();
		}
		}
	}
}