package arrays;

import java.util.Scanner;

public class arrayz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		double[] prices = new double[10];
		for(int i = 0; i<10;i++){
		System.out.print("Price:");	
		prices[i]=userInput.nextDouble();
			
		}
		for(int i = 0; i<10;i++){
			double fart = 0.0;
			fart = prices[i]*0.1;
			prices[i] = prices[i]-fart;
			
		}
		for(int i = 0; i<10;i++){
			System.out.println("Price is "+prices[i]);	
	}}

}
