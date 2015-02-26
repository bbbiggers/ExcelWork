package Warmups;

public class recursionstringreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "    ayyy        lma        o   ";

s=s.trim();
System.out.println(s);
//System.out.println(farts(s));
	}
public static String farts(String s){
if(!s.contains("y")){
	System.out.println("a");
	return s;
}else{
	System.out.println("b");
	s=s.replace("y", "x");
	return s;
}

	
}
}
