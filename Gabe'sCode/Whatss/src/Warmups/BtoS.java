package Warmups;

public class BtoS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "babxbgb";
		System.out.println(BtoS(a));
		System.out.println(Integer.MAX_VALUE);
	}

	private static String BtoS(String a){
	
	if(a.contains("b")||a.contains("B")){
	int b = a.indexOf("b");
	int c = a.indexOf("B");
	if(b!=-1){
	String x = a.substring(b,b+1);
	x = "s";
	String y = a.substring(b+1);
	String z = a.substring(0,b);
	a = z+x+y;
	}
	return BtoS(a);
	}else{
	return a;
		
	}
	
}
}

