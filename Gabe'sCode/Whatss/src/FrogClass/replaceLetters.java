package FrogClass;

import java.util.Scanner;

public class replaceLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		System.out.println("Message with extra x's");
		String s = userInput.nextLine();
		String newS = s.replaceAll("x","");
		System.out.println(newS);
	}

}
