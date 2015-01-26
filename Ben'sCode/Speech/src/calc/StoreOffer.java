package calc;

import java.util.Scanner;

public class StoreOffer {
public static void main(String[] args) {
	double lock[] = new double[10]; 
	
	double c = 0;
	Scanner Imput = new Scanner(System.in);
	for(int i = 0; i < 10; i++) {
	System.out.println("Price for item number "+(i+1)); 
	lock[i] = Imput.nextDouble();
	}
	for(int i = 0; i < 10; i++) {
		c = lock[i]*.1;
		lock[i] = lock[i]-c;
	}
	System.out.println("Your Prices are");
	System.out.println(lock[0]);
	for(int i = 0; i < 10; i++) {
		System.out.println(lock[i]);
		}
}
}
