package sec01.exam02;

public class StudentExam {

	public static void main(String[] args) {
		Student stu = new Student("홍길동", "123456-1234567", 1);
		System.out.println("이름 : " + stu.name); //People(부모)에게 상속받은 필드 출력
		System.out.println("주민번호 : " + stu.ssn); //People(부모)에게 상속받은 필드 출력
		System.out.println("학번 : " + stu.StudentNo);
	}

}
