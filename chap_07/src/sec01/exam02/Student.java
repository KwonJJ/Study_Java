package sec01.exam02;

public class Student extends People{
	public int StudentNo; // 학번
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 매개변수 2개짜리 부모 생성자 호출
		this.StudentNo = studentNo;
	}
}
