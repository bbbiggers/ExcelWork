package NewYear.src.Click;

public class Archer {
private int arrows = 50;
	
	public Archer() {
	}
	
	public Archer(int A) {
		arrows = A;	
	}
	
	public int GetArrows() {
		return arrows;
	}

	public void Shoot() {
		arrows = arrows-1;
	}
}
