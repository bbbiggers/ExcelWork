package calc;
import java.util.Scanner;

public class SentenceI {
	public static void main (String[] args) {
int count = 0;
Scanner userInput = new Scanner(System.in);

System.out.println("Enter a scnetence: ");
String Pr = userInput.nextLine();
	while(count != 20) {
		System.out.println(Pr);
		count++;
	}
	}
}
