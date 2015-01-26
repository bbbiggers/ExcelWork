package superclasses;

public class Circle extends shapes{

private double radius;

public Circle(double r){
	radius=r;
}

public double area(){
return Math.PI*(radius*radius);	
	
}

public double perimiter(){
	return 2*Math.PI*radius;
	
}




}
