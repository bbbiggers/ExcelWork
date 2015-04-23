package FrogClass;

public class Shoe {

	private double price;
	//private double salePrice;
	private boolean inStock;
	
	
	public Shoe(double p){
		price = p;
		//salePrice = 
		inStock = true;
	}
	
	
	public double getPrice(){
		
		return price;
		
	}
	public double getSalePrice(int percent){
		
		return price+(price*percent);
	}
	public boolean inStock(){
		
		return inStock;
	}
	
}
