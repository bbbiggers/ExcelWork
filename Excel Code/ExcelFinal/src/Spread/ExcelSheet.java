package ExcelFinal.src.Spread;

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
			Sheet[2][3] = "92";
			Sheet[1][4] = "92";
			printSheet();
		}
		else if(Exit.equals("clear all")) {
			clearall();
		}
		}
	}
	public static void printSheet() {
		FixIt();
		Line(1);
		Line(0);
		for(int i = 1; i < 11; i++) {
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
		String Liner = "";
		
		if(N == 10) {
			N = N-1;
			for(int j = 0; j < 7; j++) {
				Liner = Liner+Sheet[N][j]+"|"; 
			}
			System.out.print("     10     |"+Liner+"\n");
		}
		else {
			for(int j = 0; j < 7; j++) {
				Liner = Liner+Sheet[N][j]+"|"; 
			}
			System.out.print("     "+N+"      |"+Liner+"\n");
		}
		
		Line(0);
	}
	public static void FixIt() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 7; j++) {
				if(Sheet[i][j].length() > 12) {
					Sheet[i][j] = Sheet[i][j].substring(0, 11);
				}
				else if(Sheet[i][j].length() < 12) {
					int k = Sheet[i][j].length();
					k = 12-k;
					for(int o = 0; o < k; o++) {
						Sheet[i][j] = Sheet[i][j]+" ";
					}
				}
				
			}
		}
	}
	
	
}


