package warmUp;
public class snowMan {

	private double maxTemp;
	private String scarfColor;
	private String hatColor;
	private String name;

	public snowMan(String sc, String hc, String n, double mT) {
		scarfColor = sc;
		hatColor = hc;
		name = n;
		maxTemp = mT;
	}
	public boolean melt(double temp) {
		if(temp > maxTemp) {
			return true;
		}
		else {
			return false;
		}
	}
}
