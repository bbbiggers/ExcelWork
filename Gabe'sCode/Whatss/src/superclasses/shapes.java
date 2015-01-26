package superclasses;

public abstract class shapes implements Measurable{
/*
private int numSides;
	
	public shapes(int s){
		numSides = s;
		}
	
	
	public int getSides(){
		return numSides;
	}
	
	*/
	//public abstract void rotate();
	
	//public abstract double angleMeasurement();
	
	public abstract double area();
	
	public abstract double perimiter();	
	
	public double getAmount(){
		return area();
	}
}
