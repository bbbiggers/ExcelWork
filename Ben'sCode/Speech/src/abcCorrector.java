

import java.util.Scanner;

public class abcCorrector {

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
		
		if(first.compareTo(second) > 0) {
			if(first.compareTo(third) > 0) {
			un = first;
			if(third.compareTo(second) > 0) {
				da = third;
				tre = second;
			}
			else if(third.compareTo(second) > 0) {
				da = second;
				tre = third;
			}
			} else {
				da = third;
				tre = second;
				}
//++++++++++++++++++++++++++++++++++++++++++++++++++++++++
		} else if(second.compareTo(third) > 0) {
			if(second.compareTo(first) > 0) {
			un = second;
			if(first.compareTo(third) > 0) {
				da = first;
				tre = third;
			}
			else if(first.compareTo(third) > 0) {
				da = third;
				tre = first;
			}
			} else {
				da = first;
				tre = third;
				}
	
		//++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	}else if(third.compareTo(first) > 0) {
		if(third.compareTo(second) > 0) {
		un = third;
		if(first.compareTo(second) > 0) {
			da = first;
			tre = second;
		}
		else if(first.compareTo(second) > 0) {
			da = second;
			tre = first;
		}
		} else {
			da = first;
			tre = second;
			}
		
		runner(un, da, tre);
	}
		
}
		
		
		
	public static void runner(String un, String da, String tre) {
		
		System.out.println("Here is it in Alphabetical order!");
		System.out.println(" "+un+" "+da+" "+tre+".");
		
		
	}
	
	
}
