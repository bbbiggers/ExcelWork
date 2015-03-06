package warmUp;

import java.util.ArrayList;

public class FourAjacet {
public static String email = "bb.duck@gmail.org";
	public static void main(String[] args) {
		int[] lol = new int[8];
		lol[0] = 3;
		lol[6] = 2;
		lol[5] = 8;
		lol[1] = 2;
		lol[2] = 3;
		lol[3] = 45;
		lol[4] = 34;
		System.out.println(suffix());
		//System.out.println(Leopold(lol));
	}
	
	public static String suffix() {
		String Temp = "NOTHING";
		for(int i = (email.length())-1; i > 0; i--) {
		Temp = email.substring(i-1, i);
		if(Temp.equals(".")) {
		Temp = email.substring(i);   // fhefdbf.org
		i = 0;
		}
		}
		return Temp;
		}
	
	public static int Leopold(int[] ll) {
		int t = 0;
		if(ll.length > 4) {
		for(int i = 0;i<ll.length-3; i++) {
			if((ll[i]+ll[i+1]+ll[i+2]+ll[i+3]) > t) {
				t = ll[i]+ll[i+1]+ll[i+2]+ll[i+3];
			}
		}
		}
		else if(ll.length == 4) {
			t = ll[0]+ll[1]+ll[2]+ll[3];
		}
		return t;
	}
}
