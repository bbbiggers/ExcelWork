package vending;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
    int TotalItems = 20;
    double[] prices = new double[TotalItems];
	int[] ItemLocation = new int[TotalItems];
	String[] Item = new String[TotalItems];
	int random = (int)(Math.random()*6);
	Scanner Imput = new Scanner(System.in);
	
	String[] Food = new String[6];
	Food[0] = "Fresh Dough";
	Food[1] = "Cheese";
	Food[2] = "Dope";
	Food[3] = "Weed";
	Food[4] = "Chex-MIX";
	Food[5] = "Cheese Wizzle";
	for(int i = 0; i < TotalItems; i++) {
	random = (int)(Math.random()*6);
	ItemLocation[i] = i;
	random = (int)(Math.random()*6);
	Item[i] = Food[random];
	System.out.println("What should the Price be for "+Item[i]+" be?");
	prices[i] = Imput.nextDouble();
	}
	
	VendMachine Back = new VendMachine(prices, Item, TotalItems);

	}
}
