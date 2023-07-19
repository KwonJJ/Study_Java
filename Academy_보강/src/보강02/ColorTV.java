package 보강02;

class ColorTV extends TV {
	private int cost;
	
	public ColorTV(int size, int cost) {
		super(size);
		this.cost = cost;
	}

	public void printProperty() {
		System.out.print(getSize() + "인치 " + cost + "만원\n");
	}

}
