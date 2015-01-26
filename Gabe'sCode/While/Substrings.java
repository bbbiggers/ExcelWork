package While;

public class Substrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "was and It dark night a stormy";
		//                 012345678901234567890123456789
		String A = sentence.substring(8,11);
		String B = sentence.substring(0,5);
		String C = sentence.substring(10,16);
		String D = sentence.substring(4,8);
		String E = sentence.substring(24,30);
		String F = sentence.substring(15,21);
		
		System.out.println(A+B+C+D+E+F);
		
		
	}

}
