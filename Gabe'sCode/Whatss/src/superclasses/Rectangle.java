package superclasses;

public class Rectangle extends shapes implements Measurable {

private double length;
private double width;
public Rectangle(double l,double w){
length =l;
width =w;
	
}

public double area(){
	return length*width;

}



public double perimiter(){

return 2*length+2*width;


}







}
