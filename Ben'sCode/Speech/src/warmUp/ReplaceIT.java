package warmUp;

import java.util.Scanner;

public class ReplaceIT {

	public static void main(String[] args){
		Scanner Imputes = new Scanner(System.in);
		System.out.println("Give me a sentence!");
		String Sent = Imputes.nextLine();
		System.out.println("Replace:");
		String R = Imputes.nextLine();
		System.out.println("With:");
		String W = Imputes.nextLine();
		String Ne = Sent.replace(R, W);
		System.out.println(Ne);
	}
}
