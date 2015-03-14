package NewYear.src.warmUp;

public class Piggy {

	private int pennies;
	private int dimes;
	private int nickles;
	private int quarters;
	private double doe;
	
	public Piggy(int p, int d, int n, int q) {
		pennies = p;
		dimes = d;
		nickles = n;
		quarters = q;
	}
	public double getTotal() {
		doe = (pennies*.01)+(dimes*.1)+(nickles*.5)+(quarters*.25);
		return doe;
	}
	public boolean canAfford(double cost) {
		if(cost < doe) {
			return true;
		}
		else {
			return false;
		}
	}
}
