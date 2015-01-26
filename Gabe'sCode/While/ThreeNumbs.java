package While;
import java.util.Scanner;
public class ThreeNumbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
	
		System.out.println("3 numbers 1 line");
		String word = userInput.nextLine();
		
		int A = word.indexOf(" ");
		int X = Integer.parseInt(word.substring(0,A));
		
		int B = word.indexOf(" ", A+1);
		int Y = Integer.parseInt(word.substring(A+1,B));
		
		int Z = Integer.parseInt(word.substring(B+1));
		
		int Q = (X+Y+Z);
		int S = (X*Y*Z);
		
		while (! (Q>30) || ! (S<30)){
		int dog = userInput.nextInt();
		Q+=dog;
		S*=dog;
		}
		
		
		
		System.out.println(X);
		System.out.println(Y);
		System.out.println(Z);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
