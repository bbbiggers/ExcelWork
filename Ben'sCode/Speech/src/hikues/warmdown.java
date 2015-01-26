package hikues;

import java.util.Scanner;

public class warmdown {
public static void main(String[] args) {
	Scanner Imput = new Scanner(System.in);
	System.out.println("What is your Max?");
	int max = Imput.nextInt();
	
	Printer(max);	
}
	public static void Printer(int max){
		int count = 1;
		while(count < max){
			System.out.println(count+", ");
				count = count+1;
		}
		System.out.println(max+".");
		
	}
}
