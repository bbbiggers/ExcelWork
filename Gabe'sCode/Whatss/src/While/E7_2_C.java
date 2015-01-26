package While;

public class E7_2_C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] data = {1.0,2.0,3.0,4.0};
		
		
		mean(data);
		variance (data);	
	}

	public static double mean(double[] data) {
		double average = 0;
		for(int i = 0;i<=data.length-1;i++){
		average+=data[i];
		  }
		average = average/data.length;
		//System.out.println(average);
		return average;
		}
	public static double variance(double[] data){
		double average = mean(data);
		average = average*average;
		for (int i = 0; i<=data.length-1;i++){
		data[i] = data[i]*data[i];
		  }
		double sqrAverage = mean(data);
		double finalVariance = sqrAverage-average;
		System.out.println(finalVariance);
		return finalVariance;
		}
	
}
