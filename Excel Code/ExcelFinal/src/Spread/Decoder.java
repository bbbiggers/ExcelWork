package Spread;

import java.util.Scanner;

public class Decoder {

	public static void main(String[] args) {

		Scanner Imput = new Scanner(System.in);
		String Exit = "";
		while(!Exit.equals("EXIT")){
			System.out.println("enter a command:");
			Exit = Imput.nextLine();
			int ReturnGF = Decpher(Exit);
			String Go = PrintI(ReturnGF);
			System.out.println(Go);
		}
	}
	public static int Decpher(String Exit) {
		int total = 0;
		if(Exit.length() == 8) {
			if(Exit.substring(0,1).equals("1")) {
				total = total+128;
			}
			else {
				total = total;
			}
			if(Exit.substring(1,2).equals("1")) {
				total = total+64;
			}
			else {
				total = total;
			}
			if(Exit.substring(2,3).equals("1")) {
				total = total+32;
			}
			else {
				total = total;
			}
			if(Exit.substring(3,4).equals("1")) {
				total = total+16;
			}
			else {
				total = total;
			}
			if(Exit.substring(4,5).equals("1")) {
				total = total+8;
			}
			else {
				total = total;
			}
			if(Exit.substring(5,6).equals("1")) {
				total = total+4;
			}
			else {
				total = total;
			}
			if(Exit.substring(6,7).equals("1")) {
				total = total+2;
			}
			else {
				total = total;
			}
			if(Exit.substring(7).equals("1")) {
				total = total+1;
			}
			else {
				total = total;
			}
		}
		return total;
	}
	public static String PrintI(int i) {
		if(i > 96) {
			i = i-32;
		}
		if(i == 46){
			return ".";
		}
		else if(i == 32){
			return " ";
		}
		else if(i == 65){
			return "A";
		}
		else if(i == 66){
			return "B";
		}
			else if(i == 67){
				return "C";
		}
			else if(i == 68){
				return "D";
			}
			else if(i == 69){
				return "E";
			}
			else if(i == 70){
				return "F";
			}
			else if(i == 71){
				return "G";
			}
			else if(i == 72){
				return "H";
			}
			else if(i == 73){
				return "I";
			}
else if(i == 74){
	return "J";
			}	
else if(i == 75){
	return "K";
}	
else if(i == 76){
	return "L";
}	
else if(i == 77){
	return "M";
}	
else if(i == 78){
	return "N";
}	
else if(i == 79){
	return "O";
}	
else if(i == 80){
	return "P";
}
else if(i == 81){
	return "Q";
}
else if(i == 82){
	return "R";
}
else if(i == 83){
	return "S";
}
else if(i == 84){
	return "T";
}
else if(i == 85){
	return "U";
}
else if(i == 86){
	return "V";
}
else if(i == 87){
	return "W";
}
else if(i == 88){
	return "X";
}
else if(i == 89){
	return "Y";
}
else if(i == 90){
	return "Z";
}		
else {
	return "B";
}
		
	}
}






