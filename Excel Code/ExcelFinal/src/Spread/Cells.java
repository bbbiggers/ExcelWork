package Spread;

public class Cells {
	private int N;
	private static String[][] Sheet;
	public Cells(String[][] Sheat, int A) {
		Sheet = Sheat;
		N = A;
	}
	
	public static void Cel(int N) {
		String Liner = "";
		
		if(N == 10) {
			N = 9;
			for(int j = 0; j < 7; j++) {
				Liner = Liner+Sheet[N][j]+"|"; 
			}
			System.out.print("     10     |"+Liner+"\n");
		}
		else if(N <=9 && N != 0) {
			for(int j = 0; j < 7; j++) {
				Liner = Liner+Sheet[N][j]+"|"; 
			}
			System.out.print("     "+N+"      |"+Liner+"\n");
		}
		
		
	}
}