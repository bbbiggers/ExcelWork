package Spread;

import java.util.ArrayList;

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
		ArrayList<String> killoffGabe = new ArrayList<String>();
	for(int i = 0; i < info.length(); i++) {
		if(i != info.length()) {
			killoffGabe.add(info.substring(i, i+1)); 
		}
		else {
			killoffGabe.add(info.substring(i)); 
		}
	}
	for(int i = 0; i < killoffGabe.size(); i++) {
		if(killoffGabe.get(i).contains("+") || killoffGabe.get(i).contains("-") || killoffGabe.get(i).contains("*") || killoffGabe.get(i).contains("/")) {
			count++;
		}
	}
		return count;
	}
	public static int FindOperation(String i) {
		int Location = 1;
		if(i.contains("+")) {
			if(i.indexOf("+") < Location) {
			Location = i.indexOf("+");
			}
		}
		if(i.contains("-")) {
			if(i.indexOf("-") < Location) {
				Location = i.indexOf("-");	
				}
		}
		if(i.contains("/")) {
			if(i.indexOf("/") < Location) {
				Location = i.indexOf("/");	
				}
		}
		if(i.contains("*")) {
			if(i.indexOf("*") < Location) {
				Location = i.indexOf("*");	
				}
		}
		return Location;
	}
	public static int SecondOperation(String i) {
		int lo  = 0;
		lo = FindOperation(i); System.out.println("G"+lo);
		lo = FindOperation(i.substring(lo+1))+lo+1; System.out.println("G"+lo);
		return lo;
	}
	public static String fluck(String l) {
		String temp1 = "";
		String temp2 = "";
		for(int i = 0; i < l.length(); i++) {
			if(l.substring(i, i+1).equals(" ")) {
				temp1 = l.substring(0, i); System.out.println("t1"+temp1);
				temp2 = l.substring(i+1);  System.out.println("t2"+temp2);
				l = temp1+temp2;
			}
		}
		return l;
	}
	public static double UberSolve(String i) {
		double Value = 0;
		String vo = "";
		if(i.contains("(") && i.contains(")") && i.contains(" ")) {
			int j = i.indexOf("(")+1;
			int k = i.indexOf(")");
		 	String Equa = i.substring(j, k); //3+334+346-232/2
			int OperationAmount = OpAmt(Equa); //4 
			System.out.println(OperationAmount+"op");
			if(OperationAmount == 1) {
			return Solve(Equa);
			}
			if(OperationAmount == 0) {
				return Double.parseDouble(Equa);
				}
			for(int KKK = OperationAmount; KKK > 1; KKK--) {
				System.out.println("Is it going hereg"+Equa);
				if(Equa.contains(" ")) {
				Equa = fluck(Equa);	
				}
				System.out.println("Is it going there"+Equa);
				if(KKK == OperationAmount) {
					System.out.println("po"+Equa.substring(0, FindOperation(Equa)));
					//System.out.println("this stupid thins"+Solve(Equa.substring(0, FindOperation(Equa))));
					vo = ""+Solve(Equa.substring(0, SecondOperation(Equa)));
					Equa = Equa.substring(SecondOperation(Equa)); //System.out.println("Is it going here"+Equa);
				}
				System.out.println(vo+"Volo");
				if(OpAmt(Equa) == 1) {
					vo = ""+Solve(vo+Equa);
				}
				else {
				vo = ""+Solve(vo+Equa.substring(0, SecondOperation(Equa)));
				Equa = Equa.substring(SecondOperation(Equa));
				}
				}
			Value = Double.parseDouble(vo);
			return Value;
		}
		else {
			System.out.println("Vo");
			return 0.0;
		}
	}
	public static double Solve(String i) {
		System.out.println("the i in solve:"+i+":");
		int j = 0;
		int k = i.length();
		if(i.contains("+")) {
			int oper = i.indexOf("+");
			double FirstNumber = Double.parseDouble(i.substring(j, oper));
			double SecondNumber = Double.parseDouble(i.substring(oper+1, k));
			return (FirstNumber+SecondNumber);
		}
		else if(i.contains("*")) {
			int oper = i.indexOf("*");
			double FirstNumber = Double.parseDouble(i.substring(j, oper));
			double SecondNumber = Double.parseDouble(i.substring(oper+1, k));
			return (FirstNumber*SecondNumber);
		}
		else if(i.contains("/")) {
			int oper = i.indexOf("/");
			double FirstNumber = Double.parseDouble(i.substring(j, oper));
			double SecondNumber = Double.parseDouble(i.substring(oper+1, k));
			return (FirstNumber/SecondNumber);
		}
		else if(i.contains("-")) {
			int oper = 0;
			if((i.substring(0, 2)).contains("-") && (i.substring(2)).contains("-")) {
				oper = i.indexOf("-", 2);
			}
			else if(!((i.substring(1)).contains("-"))) {
				return Double.parseDouble(i);
			}
			else {
				oper = i.indexOf("-");
			}
			double FirstNumber = Double.parseDouble(i.substring(j, oper));
			double SecondNumber = Double.parseDouble(i.substring(oper+1, k));
			return (FirstNumber-SecondNumber);
		}
		else {System.out.println("Need Help? j"); return 0;}
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
