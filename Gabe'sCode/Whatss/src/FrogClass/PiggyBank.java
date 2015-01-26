package FrogClass;

public class PiggyBank {
private int pennies;
private int dimes;
private int nickels;
private int quarters;

public PiggyBank(int p,int d,int n,int q){
	pennies=p;
	dimes=d;
	nickels=n;
	quarters=q;
	
	
}
public double getTotal(){
double pt;
double dt;
double nt;
double qt;

pt = pennies*.01;	
dt = dimes*.1;
nt = nickels*.05;
qt=quarters*.25;
return pt+dt+nt+qt;	
}
public boolean canAfford(double cost){
	double pt;
	double dt;
	double nt;
	double qt;

	pt = pennies*.01;	
	dt = dimes*.1;
	nt = nickels*.05;
	qt=quarters*.25;
	double t = pt+dt+nt+qt;	
	if (t>=cost){
		return true;
	}else{
		return false;
	}
	
}

}
