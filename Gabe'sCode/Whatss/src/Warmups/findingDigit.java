package Warmups;

public class findingDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 774774347;
		System.out.println(frog(a));
		
		
	}

	public static int frog(int a){
		if(a<7){
			return 0;
		}
		if(a%10 == 7){
			return 1+frog(a/10);
		}
		else{
			return frog(a/10);
		}
	}
	
	
	
}
