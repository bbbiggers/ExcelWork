package warmUp;

import java.util.ArrayList;
import java.util.Scanner;

public class NewNoSnow {

	public static void main(String[] args) {
	 Scanner userImpot = new Scanner(System.in);
	ArrayList<Double> Quack = new ArrayList<Double>();
	double Click = 1;
		while(Click != 0) {
			Click = userImpot.nextDouble();
			if(Click != 0) {
				Quack.add(Click);
			}
		}
		double truck = 0;
		int count = 0;
		for(int i = 0; i < Quack.size(); i++) {
		truck = truck+Quack.get(i);
			count++;
		}
		truck = truck/count;
		System.out.println(truck);
	}
}
