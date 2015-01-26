package While;
import java.util.Scanner;
public class fraccalc {

	public static void Add(String equation){
		System.out.println("add");
		int charlie = equation.indexOf("+");
		int alpha = equation.indexOf("_");
		int beta = equation.indexOf("_",charlie);
		
		if (alpha !=-1){
			int wholevalue1 = Integer.parseInt(equation.substring(0,alpha));
			System.out.println(wholevalue1);
		}
		if (beta !=-1){
			int wholevalue2 = Integer.parseInt(equation.substring(charlie,beta));
			System.out.println(wholevalue2);
			
		}
		int delta = equation.indexOf("/");
		int numerator1 = Integer.parseInt(equation.substring(alpha+1,delta));
		System.out.println(numerator1);
		int denominator1 = Integer.parseInt(equation.substring(delta+1,charlie));
		System.out.println(denominator1);
		
		
		int E = equation.indexOf("/",charlie);
		int  numerator2 = Integer.parseInt(equation.substring(alpha+1,E));
		System.out.println(numerator2);
		int denominator2 = Integer.parseInt(equation.substring(E+1));
		System.out.println(denominator2);
		
		
		
		
	//1_2/3+4_5/6
		
}
	public static void Subtract(String equation){
		System.out.println("subtract");
	
		int charlie = equation.indexOf("-");
		int alpha = equation.indexOf("_");
		int beta = equation.indexOf("_",charlie);
		
		if (alpha !=-1){
			int wholevalue1 = Integer.parseInt(equation.substring(0,alpha));
			System.out.println(wholevalue1);
		}
		if (beta !=-1){
			int wholevalue2 = Integer.parseInt(equation.substring(charlie+1,beta));
			System.out.println(wholevalue2);
			
		}
		int delta = equation.indexOf("/");
		int numerator1 = Integer.parseInt(equation.substring(delta -1,delta));
		System.out.println(numerator1);
		
		
		int denominator1 = Integer.parseInt(equation.substring(delta+1,delta+2));
		System.out.println(denominator1);
		
		
		int E = equation.indexOf("/",charlie);
		int  numerator2 = Integer.parseInt(equation.substring(E -1,E));
		System.out.println(numerator2);
		
		
		int denominator2 = Integer.parseInt(equation.substring(E+1,E+2));
		System.out.println(denominator2);
}
	public static void Multiply(String equation){
		System.out.println("mult");

		int charlie = equation.indexOf("*");
		int alpha = equation.indexOf("_");
		int beta = equation.indexOf("_",charlie);
		
		if (alpha !=-1){
			int wholevalue1 = Integer.parseInt(equation.substring(0,alpha));
			System.out.println(wholevalue1);
		}
		
		if (beta !=-1){
			int wholevalue2 = Integer.parseInt(equation.substring(charlie+1,beta));
			System.out.println(wholevalue2);
			
		}
		int delta = equation.indexOf("/");
		int numerator1 = Integer.parseInt(equation.substring(delta -1,delta));
		System.out.println(numerator1);
		
		
		int denominator1 = Integer.parseInt(equation.substring(delta+1,delta+2));
		System.out.println(denominator1);
		
		
		int E = equation.indexOf("/",charlie);
		int  numerator2 = Integer.parseInt(equation.substring(E -1,E));
		System.out.println(numerator2);
		
		
		int denominator2 = Integer.parseInt(equation.substring(E+1,E+2));
		System.out.println(denominator2);
	
}
	public static void Divide(String equation){
		System.out.println("dvde");
		int charlie = equation.indexOf("/");
		int alpha = equation.indexOf("_");
		int beta = equation.indexOf("_",charlie);
		
		if (alpha !=-1){
			int wholevalue1 = Integer.parseInt(equation.substring(0,alpha));
			System.out.println(wholevalue1);
		}
		if (beta !=-1){
		int wholevalue2 = Integer.parseInt(equation.substring(charlie+3,beta));
		System.out.println(wholevalue2);
		}
		
		int delta = equation.indexOf("/");
		int numerator1 = Integer.parseInt(equation.substring(delta -1,delta));
		System.out.println(numerator1);
		
		
		int denominator1 = Integer.parseInt(equation.substring(delta+1,delta+2));
		System.out.println(denominator1);
		
		
		int E = equation.indexOf("/",charlie+1);
		int  numerator2 = Integer.parseInt(equation.substring(E -1,E));
		System.out.println(numerator2);
		
		
		int denominator2 = Integer.parseInt(equation.substring(E+1,E+2));
		System.out.println(denominator2);
}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
	
		System.out.println("Enter");
		String equation = userInput.nextLine();
		
		
	
		while ((!equation.equals("quit"))){
			int A = equation.indexOf("+");
			int B = equation.indexOf("-");
			int C = equation.indexOf("*");
			int D = equation.indexOf("/");
		if(A != -1){
		Add(equation);
		}
		else if(B != -1){
		Subtract(equation);
		}
		else if(C != -1){
		Multiply(equation);
		}
		else if(D != -1){
		Divide(equation);
		}
		System.out.println("Enter");
		equation = userInput.nextLine();
		}
	}
}
