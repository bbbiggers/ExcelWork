package While;
import java.util.Scanner;
public class E6_5 {

	public static void getAverage(int A,int B,int C){
		int D = (((A+B+C)/3));
		System.out.println("Average:"+D);
	
	}
	
	
	
	public static void getSmallest(int A,int B,int C){
		if (A < B && A <C){
			System.out.println("Smallest:"+A);
		}
		else if (B < A && B < C){
			System.out.println("Smallest:"+B);
		}
		else if (C < A && C < B){
			System.out.println("Smallest:"+C);
		}
	}
	
	
	
	public static void getLargest(int A,int B,int C){
		if (A > B && A > C){
			System.out.println("Largest:"+A);
		}
		else if (B > A && B > C){
			System.out.println("Largest:"+B);
		}
		else if (C > A && C > B){
			System.out.println("Largest:"+C);
		}
	}
	
	
	public static void getRange(int A,int B,int C){
	
		
	
	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		
		
		System.out.println("1st number");
		int A = userInput.nextInt();
		
		System.out.println("2nd number");
		int B = userInput.nextInt();
		
		System.out.println("3rd number");
		int C = userInput.nextInt();
		
		getAverage(A,B,C);
		getSmallest(A,B,C);
		getLargest(A,B,C);
		getRange(A,B,C);
	}

}
