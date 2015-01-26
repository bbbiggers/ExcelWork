package warmUp;

import java.util.ArrayList;

public class PleaseSnow {

	public static void main(String[] args) {
		ArrayList<Double> DoubleList = new ArrayList<Double>();
		double[] DoubleAr = new double[6];
		
		DoubleAr[0] = 2.5;
		DoubleAr[1] = 3.68;
		DoubleAr[2] = 0.29;
		DoubleAr[3] = 4.2;
		DoubleAr[4] = 6.87;
		DoubleAr[5] = 3.5;
		System.out.println(DoubleAr[0]);
		int k = DoubleAr.length;
		for(int i = 0; i< DoubleAr.length; i++) {
			k--;
			DoubleList.add(DoubleAr[k]);
		
		}
	System.out.println(DoubleAr[k]);
	System.out.println(DoubleList);

	}
}
