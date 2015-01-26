package Warmups;

public class archertester extends Archer{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Archer a1 = new Archer(50);
Archer a2 = a1;		
System.out.println(a2);
a1.refillArrows(300);
System.out.println(a2);
	}

}
