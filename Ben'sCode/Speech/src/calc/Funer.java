package calc;

import java.util.Scanner;

public class Funer {
	
	public static void main(String[] args) {
		
		Scanner userimput = new Scanner(System.in);
		System.out.println("what is your first word?");
		String first = userimput.nextLine();
		System.out.println("what is your second word?");
		String second = userimput.nextLine();
		System.out.println("what is your third word?");
		String third = userimput.nextLine();
		
		String un = "none";
		String da = "none";
		String tre = "none";
		
		if(first.compareTo(second) > 0 && first.compareTo(third) > 0) {
			un = first;
			if(second.compareTo(third) > 0) {
				da = second;
				tre = third;
			}
			else {
				da = third;
				tre = second;
			}
		} else if(second.compareTo(first) > 0 && second.compareTo(third) > 0) {
			un = second;
			if(first.compareTo(third) > 0) {
				da = first;
				tre = third;
			}
			else {
				da = third;
				tre = first;
			}
		} else if(third.compareTo(second) > 0 && third.compareTo(first) > 0) {
			un = third;
			if(second.compareTo(first) > 0) {
				da = second;
				tre = first;
			}
			else {
				da = first;
				tre = second;
			}
		}
		String una = tre;
		String das = da;
		String tres = un;
		runner(una, das, tres);
	}
	public static void runner(String una, String das, String tres) {
		
		System.out.println("Here is it in Alphabetical order!");
		System.out.println(" "+una+" "+das+" "+tres+".");
	}
}
