import java.util.Scanner;
public class factorial {
	public static int factorial1 (int n){
		//int b = n;
		//int d = n-1;
		
		
		//if (n < 0){
		//n = -1;
		//return(n);
		//}
		
		
		int d = 0;
		int c =0;
		//else{
			
		//for	(int i = 1;i<b;i++){
		//n = n*d;
		//d--;
	//			}
		//return (n);	
		//	}
		if (n > 0){
			if (n%2 != 0){
				n=n-1;
			}
		for (int i = 0; i < n;i+=2){
		
		
		c = c+2;
		d=d+c;
		}
			
		}
		
		else if (n < 0){
			if (n%2 != 0){
				n=n+1;
			}
	for (int i = 0; i > n;i-=2){
		
		c = c-2;
		d=d+c;
	}
			
			
		}
		int g = d;
		
		return (g);
		
		
		
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner( System.in );
	
		
		int n = userInput.nextInt();
int t = factorial1(n);
System.out.println(t);
		
		
	}

}
