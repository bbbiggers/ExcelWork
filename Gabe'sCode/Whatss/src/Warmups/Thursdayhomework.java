package Warmups;

public class Thursdayhomework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LIST 1
		int[] number = {34, 7856, 76856, 1321, 78078, 23423, 56856, 123123, 768, 
                2342, 9806, 234, 3453, 65765, 89078, 13412, 4353, 
32412, 3452, 5674, 32141, 657, 8797, 435, 123, 678, 
                3453, 1231, 567, 98087, 3452, 12312, 435, 4363, 1231};
	System.out.println(List1(number));
	
		//LIST 2
		int[] number2 = {5, 7, 9, 12, 47, 62, 81, 90, 235, 260, 536, 9000, 32578};
	System.out.println(List2(number2,0,number2.length));
	
		//LIST 3
		int[] number3 = {9000, 8000, 7000, 6000, 5000, 4000, 3000, 2000, 1000, 
				900, 800, 700, 600, 500, 400, 300, 200, 100, 90, 80, 
			70, 60, 50, 40, 30, 20, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
	System.out.println(List3(number3,0,number3.length));
		
		//LIST 4
		int[] number4 = {15, 27, 38, 42, 46, 51, 63, 68, 74, 79, 84, 85, 91, 
				92, 100, 134, 156, 190, 283, 372, 400, 427, 458, 
				489, 532, 579, 632, 689, 795, 800, 861, 912, 
				913, 1000, 3475, 5875, 6241, 7048, 8043, 9031, 10000};
		System.out.println(List4(number4,51,0,number4.length));
		System.out.println(List4(number4,795,0,number4.length));
		System.out.println(List4(number4,489,0,number4.length));
		System.out.println(List4(number4,10000,0,number4.length));
		
	}
	//METHOD FOR LIST 1
	public static int List1 (int[]number){
		for(int i = 0;i<number.length;i++){
			if(number[i]==12312){
				return i;
			}
		}
		return -1;
	}
	
	//METHOD FOR LIST 2
	public static int List2(int[]number,int lo,int hi){
		int mid = (lo+hi)/2;
		if (lo>hi){
			return -1;
		}else if (number[mid]==235){
			return mid;
		}else if (number[mid]<235){
			return List2(number,mid+1,hi);
		}else{
			return List2(number,lo,mid-1);
		}
	}
	
	//METHOD FOR LIST 3
	public static int List3(int[]number,int lo,int hi){
		int mid = (lo+hi)/2;
		if (lo>hi){
			return -1;
		}else if (number[mid]==3){
			return mid;
		}else if (number[mid]<3){
			return List3(number,lo,mid-1);
		}else{
			return List3(number,mid+1,hi);
		}
	}
	
	//METHOD FOR LIST 4
	public static int List4(int[] number,int a,int lo,int hi){
		int mid = (lo+hi)/2;
		if(lo>hi){
			return -1;
		}else if (number[mid]==a){
			return mid;
		}else if (number[mid]<a){
			return List4(number,a,mid+1,hi);
		}else{
			return List4(number,a,lo,mid-1);
		}
	}
	
}


