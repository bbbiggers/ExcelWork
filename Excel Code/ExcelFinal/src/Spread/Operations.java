package Spread;

public class Operations {

	public static double Operate(String Equ, String[][] Sheat) {
		int HasLocation = 0;
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 10; j++) {
				String o = AtoB(i);
				String k = ""+j;
			if(Equ.contains(o+k)) {
			HasLocation = 1;	
			}
			}
		}
		if(HasLocation == 1) {
			return Solve(Equ);
		}
		return 0.0;
	}
	public static double Solve(String i) {
		if(i.contains("(") && i.contains(")") && i.contains(" ")) {
		int j = i.indexOf("(")+2;
		int k = i.indexOf(")")-2;
		if(i.contains("+")) {
			int oper = i.indexOf("+");
			double FirstNumber = Double.parseDouble(i.substring(j, oper-1));
			double SecondNumber = Double.parseDouble(i.substring(oper+1, k));
			return FirstNumber+SecondNumber;
		}
		else if(i.contains("-")) {
			int oper = i.indexOf("-");
			double FirstNumber = Double.parseDouble(i.substring(j, oper-1));
			double SecondNumber = Double.parseDouble(i.substring(oper+1, k));
			return FirstNumber-SecondNumber;
		}
		else if(i.contains("*")) {
			int oper = i.indexOf("*");
			double FirstNumber = Double.parseDouble(i.substring(j, oper-1));
			double SecondNumber = Double.parseDouble(i.substring(oper+1, k));
			return FirstNumber*SecondNumber;
		}
		else if(i.contains("/")) {
			int oper = i.indexOf("/");
			double FirstNumber = Double.parseDouble(i.substring(j, oper-1));
			double SecondNumber = Double.parseDouble(i.substring(oper+1, k));
			return FirstNumber/SecondNumber;
		}
		else {return 0;}
		}
		else {return 0;}
	
	}
	public static String AtoB(int Let) {
		if(Let == 0) {
			return "A";
		}
		else if(Let == 1) {
			return "B";
		}
		else if(Let == 2) {
			return "C";
		}
		else if(Let == 3) {
			return "D";
		}
		else if(Let == 4) {
			return "E";
		}
		else if(Let == 5) {
			return "F";
		}
		else if(Let == 6) {
			return "G";
		}
		else {
			return "G";
		}
		
		
	}
}
