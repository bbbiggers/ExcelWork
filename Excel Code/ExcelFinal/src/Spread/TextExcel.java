package Spread;

import java.util.Scanner;

public class TextExcel extends Spreadsheet {
	private static String[][] Sheet = new String[10][7];

	public static void main(String[] args) {
		Scanner Imput = new Scanner(System.in);
		
		
		clearall();
		String Exit = "NO"; 
		while(!Exit.equals("exit")){
		System.out.println("enter a command:");
		Exit = Imput.nextLine();
		if(Exit.equals("print")) {
			Sheet[2][3] = "92";
			Sheet[1][4] = "92";
			printSheet();
		}
		else if(Exit.equals("clear all")) {
			clearall();
		}
		}
	}