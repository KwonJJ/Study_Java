package sec01;

public class Student {
	private String name; // 학생 이름
	private String deparrtment; // 학과
	private String number; // 학번
	private double grade; // 학점

	// 생성자
	public Student(String name, String deparrtment, String number, double grade) {
		this.name = name;
		this.deparrtment = deparrtment;
		this.number = number;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public String getDeparrtment() {
		return deparrtment;
	}

	public String getNumber() {
		return number;
	}

	public double getGrade() {
		return grade;
	}

	// 학생 이름으로 학생 정보를 출력하는 메소드
	public void find_student(String name) {
		if (name.equals(this.name)) {
			System.out.println(this.name + " , " + this.deparrtment + " , " + this.number + " , " + this.grade);
		}
	}
}
