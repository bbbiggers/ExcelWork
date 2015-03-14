package Click;

import java.util.Scanner;

public class Tres {

	public static void main(String[] args) {
		Scanner POP = new Scanner(System.in);
		
		String LipoBattery = POP.nextLine();
		
		String Duck = LipoBattery.replaceAll("x", "");
		System.out.println(Duck);
	}
}
