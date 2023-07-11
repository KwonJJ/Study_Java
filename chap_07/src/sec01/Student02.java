package sec01;

public class Student02 extends Human02{ // Student02클래스에 Human02클래스를 상속
	int studentCode; // 학번
	String studentDept; // 학과
	
	Student02(int weight, int height, int studentCode){ // 방법 2(super사용)
		super(weight, height);
		this.studentCode = studentCode;
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

	@Override 
	String eat(String food) {
		String result = food + "를 매일 먹어요";
		return result;
	}
	
	
}
