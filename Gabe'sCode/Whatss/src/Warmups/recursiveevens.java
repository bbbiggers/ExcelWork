package Warmups;

public class recursiveevens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 2;
System.out.println(sumEvens(n));
	}
public static int sumEvens(int n){
	if(n==1||n==0){
		return 0;
	}
	if (n<=3){
		return 2;
	}
	else{
		if(n%2==0){
			return n+sumEvens(n-2);
		}else{
			return sumEvens(n-1);
			}
		}

	}


}
