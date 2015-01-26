package vending;

public class VendMachine {
private String[] Items;
private int[] ILocation;
private double[] Prices;
private double Price;
private int type;
private int TotalItems;
	public double Pricing(int Location) {
		Price = Prices[Location];
			return Price;
	}
	//Width of Vending Machine is 5.
	public VendMachine(double[] prices, String Items[], int TotalItems) {
		
	}
	
private void FillUp() {
	
}


public String toString() {
	String ToReturn = "";
	for(int i = 0; i<TotalItems; i++) {
		ToReturn = ToReturn+Items[i];
	}
	return "You have ";
	}

}
