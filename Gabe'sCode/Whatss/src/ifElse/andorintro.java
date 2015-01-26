package ifElse;
import java.util.Scanner;
public class andorintro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
	
		System.out.println("Number 1?");
		int A = userInput.nextInt();
		
		System.out.println("Number 2?");
		int B = userInput.nextInt();
	
		System.out.println("Number 3?");
		int C = userInput.nextInt();
	
	if (A==B && A==C && B==C){
		System.out.println("All same");
		
	}
	else if (A!=B && A!=C && B!=C){
		System.out.println("All different");
		
	}else {
		System.out.println("neither");
	}
	
	
	
	
	
	
	
	
	}

}
