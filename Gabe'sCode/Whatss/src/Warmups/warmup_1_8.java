package Warmups;

public class warmup_1_8 {

	
	
	public double distance(int x1,int y1,int x2,int y2){
		
		int X = x2-x1;
		int Y = y2-y1;
		
		int Xsqrd = X*X;
		int Ysqrd = Y*Y;
		int Thing = Xsqrd+Ysqrd;
		double ans = Math.sqrt(Thing);
		
		return ans;
	}
	
	
	
	
	
	
	
}
