package Warmups;

public class arrayworks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[]list=new double[7];
		for(int i = 1;i<=list.length;i++){
			list[i-1] = i;
		}
		System.out.println(list[2]);
		
		list[6] = 3.14;
		double temp = list[0];
		list[0] = list[1];
		list[1] = temp;
		
		for(int i = 0;i<list.length;i++){
			System.out.print(list[i]+"   ");
		}
		
		double[]list2=new double[list.length+1];
		for(int i = 0;i<list.length;i++){
			list2[i] = list[i];
		}
		list2[list.length+1] = 8.0;
	}

}