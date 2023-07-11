package sec01;

public class Student01 extends Human01{ // Student클래스에 Human클래스를 상속
	int studentCode; // 학번
	String studentDept; // 학과
	
	Student01(int studentCode, String gender, int height){ // 생성자
		this.studentCode = studentCode;
		this.gender = gender; // Human클래스에서 상속 받은 필드
		this.height = height; // Human클래스에서 상속 받은 필드
	}
	
	void study(String place) {
		System.out.println(place + "에서 공부합니다.");
	}
	
	void dressOn() {
		System.out.println("교복을 입어요.");
	}

	void dressOff() {
		System.out.println("교복을 벗어요.");
	}
}
