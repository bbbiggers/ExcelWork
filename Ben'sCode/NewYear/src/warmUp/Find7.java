package warmUp;

public class Find7 {

	public static void main(String[] args) {
		
		int f = 373774774;
		System.out.println(find(f));
	}
	public static int find(int num) {
		if(num < 7) {
			return 0;
		}
		else if(num%10 == 7) {
			num = num/10;
			return find(num)+1;
		}
		else if(num%10 != 7) {
			 num = num/10;
			 return find(num);
		}
		else {
			return find(num);
		}
		
	}
}
