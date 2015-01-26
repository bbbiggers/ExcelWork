package FrogClass;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		
		String str = userInput.nextLine();
		for(int i=str.length()-1;i>=0;i--)
			  System.out.print(str.charAt(i));
	}

}
