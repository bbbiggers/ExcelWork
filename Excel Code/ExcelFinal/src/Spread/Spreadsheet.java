package Spread;

public class Spreadsheet {
	private static String[][] Sheet;
	private static String[][] MathSheet;
	Spreadsheet(String[][] Sheat) {
		Sheet = Sheat;
		MathSheet = Sheat;
		
	}
	public static void printSheet() {
		FixIt();
		Line(1);
		Line(0);
		Cells Gabe = new Cells(Sheet, 1);
		for(int i = 1; i < 11; i++) {
			Gabe.Cel(i);
			Line(0);
		}
	}
	public static void clear(int X, int Y) {
		Sheet[X][Y] = "            ";
		MathSheet[X][Y] = "";
	}
	public static void add(int X, int Y, String info) {
		Sheet[X][Y] = info;
		MathSheet[X][Y] = info;
		FixIt();
	}
	public static void clearall() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 7; j++) {
				Sheet[i][j] = "            "; 
			}
		}
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 7; j++) {
				MathSheet[i][j] = "";
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
	public int AtoB(String Let) {
		if(Let.equals("A")) {
			return 1;
		}
		else if(Let.equals("B")) {
			return 2;
		}
		else if(Let.equals("C")) {
			return 3;
		}
		else if(Let.equals("D")) {
			return 4;
		}
		else if(Let.equals("E")) {
			return 5;
		}
		else if(Let.equals("F")) {
			return 6;
		}
		else if(Let.equals("G")) {
			return 7;
		}
		else {
			return 8;
		}
		
		
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