package sec01;

public class Car {
	String company; // 제조 회사
	int speed; // 속도
	int cost; // 가격
	String color; // 색상

	Car() { // 기본 생성자
		System.out.println("Car 호출");
	}

	class OldCar { // 중첩 클래스(인스턴스 멤버 클래스)

		int speed; // 속도
		int cost; // 가격

		OldCar() {
			System.out.println("OldCar 호출");
		}

		void speedUp(int speed) {
			this.speed += speed;
		}
	}

	void speedUp(int speed) {
		// 매개변수 1개 리턴 X 메소드
		this.speed += speed;
	}

	Car(String company, int cost) {
		// 매개변수 2개 생성자
		this.company = company;
		this.cost = cost;
	}

	void OldSpeed() {
		// Car 클래스 내부에서는 OldCar 객체 바로 생성 가능함
		OldCar old = new OldCar();
		old.speed = 50;
	}

}

class Car2 {
	Car car = new Car("현대", 300000);
	// car.speedUp(50); -> 에러 발생
	// car.OldSpeed(); -> 에러 발생
	Car.OldCar old = car.new OldCar();

}
