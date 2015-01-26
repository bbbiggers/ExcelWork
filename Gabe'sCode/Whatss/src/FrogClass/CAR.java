package FrogClass;

public class CAR {

private String color;
private int wheels;
private int speed = 0;
private int gas_percent = 100;


public CAR (String c,int w){
	color = c;
	wheels = w;
}
public String toString(){
	
return	"The "+color+" car has "+wheels+" wheels and has "+gas_percent+"% gas going at "+speed+" mph.";
	
}
public void changeColor(String newColor){
color = newColor;
	
}

public void loseWheel(int wheelsLost){
if (wheelsLost > wheels){
	System.out.println("ERROR: CANNOT HAVE LESS THAN 0 WHEELS");
	return;
}else{
wheels-=wheelsLost;	
}
}
public void Accelerate(){
speed += 10;
gas_percent-=10;

if (gas_percent == 0){
speed =0;	
}
}
public void Slow(){
if (speed == 0){
}else{
speed-=10;
}}


}
