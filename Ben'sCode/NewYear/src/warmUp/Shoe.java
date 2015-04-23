package warmUp;

public class Shoe {
	private double price;
	private boolean instock;
	
	public Shoe(double price, boolean instock) {
		price = this.price;
		instock = this.instock;	
	}
	public double getPrice() {
	return price;
	}
	public double getSalePrice(int percent) {
		double r = price/percent;
		return price-r;
	}
	boolean inStock() {
		return instock;
	}
}
