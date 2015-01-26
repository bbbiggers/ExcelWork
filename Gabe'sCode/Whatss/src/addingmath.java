import java.util.Scanner;
public class addingmath {
	
	public static void Average(int num1,int num2){
		//Averages numbers
		System.out.println("Average = "+ ((num1+num2)/2));
	}
	public static void Divide(int num1,int num2){
		//Divides numbers
		System.out.println("Divide = "+ (num1/num2));
	}
	public static void Multiply(int num1,int num2){
		//Multiplies numbers
		System.out.println("Multiply = "+ (num1*num2));
	}
	public static void Subtract(int num1,int num2){
		//Subtracts numbers
		System.out.println("Subtract = "+ (num1-num2));
	}
	public static void Add(int num1,int num2){
		//Adds numbers
		System.out.println("Add = "+ (num1+num2));
	}
	public static void main(String[] args) {
		Scanner userInput = new Scanner( System.in );
		//Asks user for 2 numbers
		System.out.println("What is 1st number?");
		int num1 = userInput.nextInt();
		System.out.println("What is 2nd number?");
		int num2 = userInput.nextInt();
	
		//Sends the numbers to the methods
		Add(num1,num2);
		Subtract(num1,num2);
		Multiply(num1,num2);
		Divide(num1,num2);
		Average(num1,num2);
	}

}
