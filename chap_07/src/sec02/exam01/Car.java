package sec02.exam01;

public class Car {
	String color; // 색상 필드(변수)
	String company; // 제조회사 필드(변수)
	int speed; // 속도 필드(변수)
	int cost; // 가격  필드(변수)
	// 4개의 필드 모두 public을 안써서 default로 설정됨
	
	public Car(String color, String company) { 
		// 매개변수 2개인 생성자, 기본생성자 생성X
		this.color = color;
		this.company = company;
	}
	
	void speedUp(int speed) {
		// 매개변수 int 1개짜리 메소드, 리턴 타입X
		// 매개변수의 숫자만큼 숫자 증가
		this.speed += speed;
	}
	
	void speedDown(int speed) {
		// 매개변수 int 1개짜리 메소드, 리턴 타입X
		// 매개변수의 숫자만큼 숫자 감소
		this.speed -= speed;
	}
	
	void start() { // 그냥 출력됨
		// 매개변수 X, 리턴타입 X
		System.out.println("시동을 걸었습니다.");
	}
	
	void stop() { // 그냥 출력됨
		// 매개변수 X, 리턴타입 X
		System.out.println("차를 멈춥니다.");
	}
	
}
