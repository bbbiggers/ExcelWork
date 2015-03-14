package Click;

import Click.PLOP.Measurable;

public abstract class StupidShape implements Measurable{
public abstract double area();
public abstract double perimeter();

public double getAmount() {
	return area();
}
	
}
