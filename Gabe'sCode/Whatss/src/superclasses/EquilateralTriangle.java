package superclasses;

public class EquilateralTriangle extends shapes{

private double sideLength;


public EquilateralTriangle (double s){
	sideLength = s;
}



public double area(){
	return (Math.sqrt(3)/4)*sideLength*sideLength;
}

public double perimiter(){
	return sideLength*3;
}



}
