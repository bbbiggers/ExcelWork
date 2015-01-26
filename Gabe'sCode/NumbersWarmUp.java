import java.util.Scanner;
public class NumbersWarmUp {

	public static void Math(int num1,int num2, int num3){
		System.out.println((num1+num2)*num3);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		System.out.println("What is 1st number?");
		int num1 = userInput.nextInt();
		System.out.println("What is 2nd number?");
		int num2 = userInput.nextInt();
		System.out.println("What is 3rd number?");
		int num3 = userInput.nextInt();
		Math(num1,num2,num3);
	}

}
