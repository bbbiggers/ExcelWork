package NewYear.src.warmUp;

public class Student {

	private String[] Hop = new String[4]; 
	private String GradeLvl;
	private double GPA;
	private int Gl;
	public Student(int GL) {
		GradeLvl = Hop[GL];
		Gl = GL;
		Hop[0] = "Freshman";
		Hop[1] = "Sophmore";
		Hop[2] = "Junior";
		Hop[3] = "Senior";

	}
	
	public double getGpa() {
		return GPA;
	}
	
	public String getGrade() {
		return GradeLvl;
	}
	public String nextClass() {
		Gl = Gl+1;
		if(Gl > 3) {
			Gl = 0;
		}
		GradeLvl = Hop[Gl];
		return GradeLvl;
	}
}
