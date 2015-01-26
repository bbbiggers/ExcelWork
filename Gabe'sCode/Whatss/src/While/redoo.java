package While;

public class redoo {
public static void holdingcell(){
	if (firstunderscore != -1 && secondunderscore != -1 ){
		int wholevalue1 = Integer.parseInt(equation.substring(0,firstunderscore));
		int wholevalue2 = Integer.parseInt(equation.substring(space2+1,secondunderscore));
		System.out.println(wholevalue1);
		System.out.println(wholevalue2);
	}
	else if (firstunderscore != -1 || secondunderscore == -1 ){
		int wholevalue1 = Integer.parseInt(equation.substring(0,firstunderscore));
		System.out.println(wholevalue1);
	}
	else if (firstunderscore == -1 || secondunderscore != -1 ){
		int wholevalue2 = Integer.parseInt(equation.substring(space2+1,secondunderscore));
		System.out.println(wholevalue2);
	}
	if (divide3 != -1){
		
	}
	}
	
public static void divide (){
	
	
}


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


	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String cat = "abcdefg";
int a = cat.length();
String catback = "";
int b = a;
int c = a-1;
int count = 0;
while (a > count){
	catback = catback+cat.substring(c,b);
	count++;
	b--;
	c--;
	
}
System.out.print(catback);
//164
	}

}
