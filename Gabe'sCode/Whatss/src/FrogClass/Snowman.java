package FrogClass;

public class Snowman {

private double maxTemp;
private String scarfColor;
private String hatColor;
	
	
public Snowman(String sc,String hc){
	scarfColor = sc;
	hatColor = hc;
	maxTemp = 2.0;
}
	
	public boolean melt(double temp){
		if (temp > maxTemp){
			return true;
		}else{
			return false;
		}
		
		
		
	}
}
