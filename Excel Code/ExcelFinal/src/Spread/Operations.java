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
			return UberSolve(Equ);
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
			count++;
		}
		else if(info.contains("-")) {
			place = info.indexOf("-");
			info = info.substring(place+1);
			count++;
		}
		else if(info.contains("*")) {
			place = info.indexOf("*");
			info = info.substring(place+1);
			count++;
		}
		else if(info.contains("/")) {
			place = info.indexOf("/");
			info = info.substring(place+1);
			count++;
		}
		else {
		System.out.println("Need Help?");
		}
	}
		return count;
	}
	public static int FindOperation(String i) {
		int Location = -1;
		if(i.contains("+")) {
			if(i.indexOf("+") > Location) {
			Location = i.indexOf("+");
			}
		}
		if(i.contains("-")) {
			if(i.indexOf("-") > Location) {
				Location = i.indexOf("-");	
				}
		}
		if(i.contains("/")) {
			if(i.indexOf("/") > Location) {
				Location = i.indexOf("/");	
				}
		}
		if(i.contains("*")) {
			if(i.indexOf("*") > Location) {
				Location = i.indexOf("*");	
				}
		}
		return Location;
	}
	public static int SecondOperation(String i) {
		int lo  = 0;
		lo = FindOperation(i); System.out.println("G"+lo);
		lo = FindOperation(i.substring(lo)); System.out.println("G"+lo);
		return lo;
	}
	public static double UberSolve(String i) {
		double Value = 0;
		if(i.contains("(") && i.contains(")") && i.contains(" ")) {
			int j = i.indexOf("(")+1;
			int k = i.indexOf(")");
		 	String Equa = i.substring(j, k); //3+334+346-232/2
			int OperationAmount = OpAmt(Equa); //4 
			if(OperationAmount == 1) {
			return Solve(Equa);
			}
			if(OperationAmount == 0) {
				return 0;
				}
			for(int KKK = OperationAmount; KKK > 0; KKK--) {
				System.out.println(Equa.substring(0, SecondOperation(Equa))+"JER");
				Value = Value+Solve(Equa.substring(0, SecondOperation(Equa)));
			}
		}
		else {System.out.println("Need Help? "); return 0;}
		return Value;
	}
	public static double Solve(String i) {
		System.out.println("the i in solve"+i);
		int j = i.indexOf("(")+1;
		int k = i.indexOf(")");
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
