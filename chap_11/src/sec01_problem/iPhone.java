package sec01_problem;

public class iPhone {
	String company;
	int cost;
	String model;

	public iPhone(String company, int cost, String model) {
		this.company = company;
		this.cost = cost;
		this.model = model;
	}

	@Override
	public String toString() {
		// toString 오버리이드
		return company + "의 최신폰인 " + model + "의 가격은 " + cost + "원입니다.";
	}

}
