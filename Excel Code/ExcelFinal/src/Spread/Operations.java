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
	public static int OpAmt(String info) {
		int count = 0;
		int place = 0;
		while(info.contains("+") || info.contains("-") || info.contains("*") || info.contains("/")) {
		if(info.contains("+")) {
			place = info.indexOf("+");
			info = info.substring(place+1);
			System.out.println(info);
		}
		else if(info.contains("-")) {
			place = info.indexOf("-");
			info = info.substring(place+1);
		}
		else if(info.contains("*")) {
			place = info.indexOf("*");
			info = info.substring(place+1);
		}
		else if(info.contains("/")) {
			place = info.indexOf("/");
			info = info.substring(place+1);
		}
		else {
		System.out.println("Need Help?");
		}
	}
		return count;
	}
	public static double Solve(String i) {
		if(i.contains("(") && i.contains(")") && i.contains(" ")) {
		int j = i.indexOf("(")+1;
		int k = i.indexOf(")");
		String Equa = i.substring(j, k);
		System.out.println("|"+Equa+"|");
		int OperationAmount = OpAmt(Equa);
System.out.println(OperationAmount);
		if(i.contains("+")) {
			int oper = i.indexOf("+");
			double FirstNumber = Double.parseDouble(i.substring(j, oper));
			double SecondNumber = Double.parseDouble(i.substring(oper+1, k));
			return FirstNumber+SecondNumber;
		}
		else if(i.contains("-")) {
			int oper = i.indexOf("-");
			double FirstNumber = Double.parseDouble(i.substring(j, oper));
			double SecondNumber = Double.parseDouble(i.substring(oper+1, k));
			return FirstNumber-SecondNumber;
		}
		else if(i.contains("*")) {
			int oper = i.indexOf("*");
			double FirstNumber = Double.parseDouble(i.substring(j, oper));
			double SecondNumber = Double.parseDouble(i.substring(oper+1, k));
			return FirstNumber*SecondNumber;
		}
		else if(i.contains("/")) {
			int oper = i.indexOf("/");
			double FirstNumber = Double.parseDouble(i.substring(j, oper));
			double SecondNumber = Double.parseDouble(i.substring(oper+1, k));
			return FirstNumber/SecondNumber;
		}
		else {System.out.println("Need Help?"); return 0;}
		
		}
		else {System.out.println("Need Help?");return 0;}
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
			System.out.println("Need Help?");
			return "G";
		}
		
		
	}
}
