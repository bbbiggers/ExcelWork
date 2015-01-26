package calc;

import java.util.Scanner;

public class Facts {

	public static void main(String[] args) {

		Scanner Imput = new Scanner(System.in);
		System.out.println("Number:");
        int n = Imput.nextInt();
		int t = Factorial(n);
		
		if(t != -1) {
			System.out.println("Factorial is: "+t);
		}
		else {
			System.out.println("Negative Number!");
		}
	}
	public static int Factorial(int n) {
		int NEWn = n;
		int speceinal = n-1;
		for(int count = 1; count < n; count++) {
			NEWn = NEWn*speceinal;
			speceinal--;
			System.out.println("At this Point2");
			System.out.println("Newn:"+NEWn+":");
		}	
		n = NEWn;
	
		return(n);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
