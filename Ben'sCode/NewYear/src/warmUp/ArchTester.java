package NewYear.src.warmUp;

import Click.Archer;

public class ArchTester {

	public static void main(String[] args) {
		Archer a1 = new Archer(50);
		
		System.out.println(a1.GetArrows());
		a1.Shoot();
		System.out.println(a1.GetArrows());

	}
}

