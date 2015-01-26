package While;
import java.util.Scanner;
public class sentencefun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		
		System.out.println("3wordsentence");
		String sentence = userInput.nextLine();
		int A = sentence.indexOf(" ");
		int B = sentence.indexOf(" ",A+2);
		String word = sentence.substring(B+1);
		
		System.out.println(word);
	}

}
