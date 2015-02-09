package Spread;

public class Spreadsheet {
	private static String[][] Sheet;
	private static String[][] ExtraSheet;
	private static double[][] MathSheet = new double[10][7];
	Spreadsheet(String[][] Sheat) {
		Sheet = Sheat;
		ExtraSheet = Sheat;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 7; j++) {
				MathSheet[i][j] = 0;
			}
		}
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
	
	public static String printCell(int x, int y) {
		return Sheet[x][y];
	}
	public static void Decipher(String Input) {
		boolean Text = false;
		boolean Para = false;
		if(Input.contains("\"")) {
			System.out.println("Screw");
			Text = true;
		}
		if(Input.contains("(") && Input.contains(")")) {
			Para = true;
		}
		if(Input.length() <= 3) {
			int X = AtoB(Input.substring(0, 1));
			int Y = 7;
			if(Input.indexOf(" ") == 2) {
				Y = Integer.parseInt(Input.substring(1, 2));
			}
			else {
				Y = 10;
			}
			printCell(X, Y);
		}
		else if(Para) {
			System.out.println("Paras");
		}
		else if(Input.substring(4, 5).equals("=") && Text) {
			int X = AtoB(Input.substring(0, 1));
			int Y = 7;
			if(Input.indexOf(" ") == 2) {
				Y = Integer.parseInt(Input.substring(1, 2));
			}
			else {
				Y = 10;
			}
			int qout = Input.indexOf("\"");
			int quot2 = Input.indexOf("\"", qout+1);
			String word = Input.substring(qout,quot2);
			System.out.println(X+" " +Y);
			System.out.println(Input.indexOf(" "));
			add(X, Y, word, 0);
		}
		else if(Input.substring(3, 4).equals("=") && Text) {
			int X = AtoB(Input.substring(0, 1));
			int Y = 7;
			if(Input.indexOf(" ") == 2) {
				Y = Integer.parseInt(Input.substring(1, 2));
			}
			else {
				Y = 10;
			}
			int qout = Input.indexOf("\"");
			int quot2 = Input.indexOf("\"", qout+1);
			String word = Input.substring(qout+1,quot2);
			System.out.println(X+" " +Y);
			add(X, Y, word, 0);
		}
		else if(Input.substring(3, 4).equals("=") || Input.substring(4, 5).equals("=")) { // C1 = 12.1
			int Eqa = Input.indexOf("=");
			int X = AtoB(Input.substring(0, 1));
			int Y = 7;
			if(Input.indexOf(" ") == 2) {
				Y = Integer.parseInt(Input.substring(1, 2));
			}
			else if(Input.indexOf(" ") == 3) {
				Y = 10;
			}
			double inf = Double.parseDouble(Input.substring(Eqa+2));
			String in = Input.substring(Eqa+2);
			System.out.println("PICK EM");
			System.out.println(X+" " +Y);
			System.out.println(Input.indexOf(" "));
			add(Y, X, in, inf);
		}
		else if(true) {
			System.out.println("TAKE A POO");
		}
	}
	public static void clear(int X, int Y) {
		Sheet[X][Y] = "            ";
		ExtraSheet[X][Y] = "";
		MathSheet[X][Y] = 0;
	}
	public static void add(int X, int Y, String info, double GoodMath) {
		if(X == 10) {
			X = 9;
		}
		if(Y == 10) {
			Y = 9;
		}
		Sheet[X][Y] = info;
		ExtraSheet[X][Y] = info;
		MathSheet[X][Y] = GoodMath;
		FixIt();
	}
	public static void clearall() {
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 7; j++) {
				Sheet[i][j] = "            ";
				ExtraSheet[i][j] = "";
				MathSheet[i][j] = 0;
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
	public static int AtoB(String Let) {
		if(Let.equals("A")) {
			return 0;
		}
		else if(Let.equals("B")) {
			return 1;
		}
		else if(Let.equals("C")) {
			return 2;
		}
		else if(Let.equals("D")) {
			return 3;
		}
		else if(Let.equals("E")) {
			return 4;
		}
		else if(Let.equals("F")) {
			return 5;
		}
		else if(Let.equals("G")) {
			return 6;
		}
		else {
			return 7;
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