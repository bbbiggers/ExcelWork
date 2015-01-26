package warmUp;
import java.util.Scanner;

public class FirRemover {
	public static void main(String[] args) {
		Scanner Imputes = new Scanner(System.in);
		System.out.println("Give me a sentence!");
		String Sents = Imputes.nextLine();
		int Sps = Sents.indexOf(" ");
		String News = Sents.substring(Sps+1);
		System.out.println("Here's your thing without the first letter:");
		System.out.println(News);
	}
}
