package Spread;

import java.util.Scanner;

public class ExcelSheet {
public static String[][] Sheet = new String[10][7];

	public static void main(String[] args) {
		Scanner Imput = new Scanner(System.in);
		clearall();
		String Exit = "NO"; 
		while(!Exit.equals("exit")){
		System.out.println("enter a command:");
		Exit = Imput.nextLine();
		if(Exit.equals("print")) {
			printSheet();
		}
		else if(Exit.equals("clear all")) {
			clearall();
		}
		}
	}
	public static void printSheet() {
		System.out.println();
	}
	public static void clearall() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 7; j++) {
				Sheet[i][j] = "            "; 
			}
		}
	}
}
