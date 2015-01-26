package While;
import java.util.Scanner;
public class zeronumber {

	
	
	public static void Math(int A) {
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		
		System.out.println("Enter a number a nonzero number");
		int A = userInput.nextInt();
		
		
		while (A!=0){
			
		Math(A);
		
		A = userInput.nextInt();
		
		}
		
		System.out.println(A);
	}
}
