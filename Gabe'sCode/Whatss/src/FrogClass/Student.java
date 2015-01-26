package FrogClass;

public class Student {
private String classname;
private double gpa;

public Student(String c,double g){
	
	classname = c;
	
	gpa = g;
	
}
public String getGPA(){
	return "Gpa is: "+gpa;
	
}public String getclass(){
	return "Class: "+classname;
	
}public void nextClass(String c){
	classname = c;
	
}



}
