package sec01_problem;

public class MyPoint {
	int n1;
	int n2;
	
	public MyPoint(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	@Override
	public String toString() {
		return "Point(" + n1 + ", " + n2 + ")";
	}

	@Override
	public boolean equals(Object obj) {
		MyPoint p = (MyPoint) obj;
		
		if(n1 == p.n1 && n2 == p.n2) {
			return true;
		}
		return false;
	}

	
}
