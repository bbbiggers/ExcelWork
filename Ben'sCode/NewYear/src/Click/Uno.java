package NewYear.src.Click;

import java.util.ArrayList;
import java.util.Scanner;

public class Uno {
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
			double mx = 0;
			for(int i = 0; i < Quack.size(); i++) {
				if(Quack.get(i) > mx) {
					mx = Quack.get(i);
				}
			

			}
			System.out.println(mx);
		}
}
