package Warmups;
import java.util.ArrayList;
public class factorialz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>Words = new ArrayList<String>();
		Words.add("a");
		Words.add("b");
		Words.add("c");
		Words.add("d");
		Words.add("e");
		Words.add("f");
		
		int a = 5;
	System.out.println(factorial1(a));
	System.out.println(factorial2(a));
	System.out.println(farts(Words));
	}
//for loop	
public static int factorial1(int a){
int answer = 1;
for(int i = a;i>0;i--){
	answer = answer*i;
}
return answer;
}

//recursion
public static int factorial2(int a){
	if (a==0){
		return 1;
	}
	return a*factorial2(a-1);
}
public static String farts(ArrayList<String>words){
int i = words.size();
if (i == 0){
return (words.get(i));
}
System.out.println(words.get(i));
return farts(words.get(i-1));

}


}

