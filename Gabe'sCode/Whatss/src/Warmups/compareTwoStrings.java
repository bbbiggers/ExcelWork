package Warmups;
import java.util.ArrayList;
public class compareTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a = "ben";
String b = "edcba";
System.out.println(compare(a,b));
	}
public static boolean compare(String a,String b){
	if(a.length()!=b.length()){
		return false;
	}
	
	int count = 0;
	ArrayList<String>WordA = new ArrayList<String>();
	for(int i = 0;i<a.length();i++){
		WordA.add(a.substring(i,i+1));
	}for(int i = 0;i<a.length();i++){
		if(b.contains(WordA.get(i))){
			count++;
		}
	}
		
	if(count == b.length()){
			return true;
		}else{
			return false;
		}
	
	}
	
}
