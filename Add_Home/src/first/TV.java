package first;

public class TV {
	private	String company;
	private	int year;
	private	int inch;
	// 매개변수
	
	public TV(String company, int year, int inch) {
		// 생성자
		this.company = company;
		this.year = year;
		this.inch = inch;
	}
	
	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV", company, year, inch);
	}
	
}
