package While;
import java.util.Scanner;
public class asfgl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		
		System.out.println("long word?");
		String word = userInput.nextLine();
		int rand = (int)(Math.random()*(word.length()));
		
		String A = word.substring(0,rand+1);
		System.out.println(A);
	}

}
