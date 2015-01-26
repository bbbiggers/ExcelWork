package Warmups;

import java.util.ArrayList;
import java.util.Scanner;

public class NewYear_Warmup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
		
		ArrayList<Double>UserNumb = new ArrayList<Double>();
		double a = 1;
		while (a != 0){
			
			System.out.println("Number:");
			a = userInput.nextInt();
			if(a!=0){
			UserNumb.add(a);
			}
		}
		double b = 0;
		for (int i = UserNumb.size();i>0;i--){
			b=UserNumb.get(i);
			
		}
		
		System.out.println(b);
		
		//This is much nicer with an arrayList
	}

}
