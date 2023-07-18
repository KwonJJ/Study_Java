package problem02;

public class Grade {
	private int math;
	private int science;
	private int english;

	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;
		this.english = english;
	}

	public int getMath() {
		return math;
	}

	public int getScience() {
		return science;
	}

	public int getEnglish() {
		return english;
	}

	public double average() {
		double result = (math + science + english) / 3;
		//double result = (getMath() + getScience() + getEnglish()) / 3; -> 이렇게도 가능
		return result;
	}
}
