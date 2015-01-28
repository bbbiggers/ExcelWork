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
		Line(1);
		Line(0);
		for(int i = 1; 1 < 11; i++) {
			Cells(i);
		}
	}
	public static void clearall() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 7; j++) {
				Sheet[i][j] = "            "; 
			}
		}
	}
	public static void Line(int Selc) {
		if(Selc == 0) {
		System.out.println("------------+------------+------------+------------+------------+------------+------------+------------+");
		}
		else if(Selc == 1) {
		System.out.println("            |     A      |     B      |     C      |     D      |     E      |     F      |     G      |");	
		}
		}
	
	public static void Cells(int N) {
		
		if(N == 10) {
			System.out.print("     10     |");
		}
		else {
			System.out.print("     "+N+"      |");
		}
		Line(0);
	}
	public static void Fix() {
		
	}
	
	
}


