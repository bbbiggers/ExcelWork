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
		
		if(N <=10 && N != 0 && N > -1) {
			N = N-1;
			for(int j = 0; j < 7; j++) {
				Liner = Liner+Sheet[N][j]+"|"; 
			}
			if(N == 9) {
				System.out.print("     10     |"+Liner+"\n");
			}
			else {
			System.out.print("     "+(N+1)+"      |"+Liner+"\n");
			}
		}
		
		
	}
}