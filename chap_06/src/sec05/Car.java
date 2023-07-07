package sec05;

public class Car {

	String model;
	int speed;
	// 필드 선언

	Car() { // Car의 기본 생성자

	}

	Car(String model) { // 매개변수 1개 생성자, 기본 생성자는 안만들어짐
		this.model = model;
	}

	void setSpeed(int speed) { // 매개변수 1개 메소드, 리턴값 X
		this.speed = speed;
	}

	void run() { // 매개변수 없는 메소드, 리턴값 X
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다.(시속 : " + this.speed + "km/h");
		}
	}
}
