package Warmups;

public class printingFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 13;
		printFactors(n);
		
		
	}

	public static void printFactors(int n){
		int a = 0;
		
		for(int i = 1;i<n;i++){
			if(n%i == 0){
				System.out.println(i);
			a = i;
					
			}
			
		}
		System.out.println(n);
		if(a==1){
			System.out.println("PRIME");
		}
	}
	
	
	
}
	
