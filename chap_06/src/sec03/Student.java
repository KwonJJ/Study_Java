package sec03;

public class Student { //멤버변수 -> 멤버변수 선언할땐 항상 주석 달아놓기
	String name; // 이름
	String studetId; //학번
	String gender; //성별
	String phoneNumber; //연락처
	int age; //나이
	
	public Student(){ // 기본생성자
		
	}
	
	public Student(String name, int age) { //매개변수 2개 생성자
		this.name = name;
		this.age = age;
	}
	
	public Student(String name, String studentId, String phoneNumber) { //매개변수 2개 생성자
		this.name = name;
		this.studetId = studentId;
		this.phoneNumber = phoneNumber;
	}

}

/* 
 * <Student 테이블 새로 만들기>
 * 멤버 변수 -> 이름, 나이, 학번, 성별, 연락처
 * 
 * 1. 기본생성자 생성하기
 * 2. 사용자 정의 생성자 2개 만듦
 * 3. 첫 번째 -> 이름, 나이
 * 4. 두 번째 -> 이름, 학번, 연락처
 */