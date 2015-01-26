import java.util.Scanner;
public class arrayzfordayz {
	
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner( System.in );
		// TODO Auto-generated method stub
		String[] words = new String[6];
		for(int i = 0;i < words.length;i++){
		System.out.println("word "+i);
			words[i]=userInput.nextLine();	
		}
		
		String g = FindRepeats(words);
		System.out.println(g);
		}
public static String FindRepeats(String words[]){
	String A = words[0];
	String B = words[1];
	String C = words [2];
	String D = words [3] ;
	String E = words[4];
	String F= words[5];
		//for(int i = 0; i<words.length;i++){
	//A = words[i];

		//}
	if (A.equals(B)||A.equals(C)||A.equals(D)||A.equals(E)||A.equals(F)){
	return "repeats found";
	}
	else if (B.equals(C)||B.equals(D)||B.equals(E)||B.equals(F)){
		return "repeats found";
		}
	else if (C.equals(D)||C.equals(E)||C.equals(F)){
		return "repeats found";
		}
	else if (D.equals(E)||D.equals(F)){
		return "repeats found";
		}
	else if (E.equals(F)){
		return "repeats found";
		}
	else{
		return "no repeats";
	}
	}
}