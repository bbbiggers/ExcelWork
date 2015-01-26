package calc;
import java.util.Scanner;
public class HOP {
	public static void main(String[] args) {
		int nm = 0;
		Scanner Imput = new Scanner(System.in);
		while(nm <= 30 || nm >= 40) {
			System.out.println("Give me Three numbers?");
			System.out.println("First:");
			int first = Imput.nextInt();
			System.out.println("Second:");
			int second = Imput.nextInt();
			System.out.println("Third:");
			int third = Imput.nextInt();
			int pnm = first+third+second;
			nm = pnm/3;
		}
		System.out.println("Your average is between 30 and 40");	
}}
