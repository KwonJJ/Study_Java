package sec01;

public class Car {
	String company; // 제조 회사
	int speed; // 속도
	int cost; // 가격
	static String color; // 색상

	Car() { // 기본 생성자
		System.out.println("Car클래스 호출");
	}

	class OldCar { // 중첩 클래스(인스턴스 멤버 클래스)

		int speed; // 속도
		int cost; // 가격

		OldCar() {
			System.out.println("OldCar클래스 호출");
		}

		void speedUp(int speed) {
			this.speed += speed;
		}

		void carCall() {
			// 인스턴스 메소드에서 바깥 클래스의 필드와 메소드 접근 가능
			company = "현대";
			stop();
		}
	}

	static class Truck {
		int cost;
		static int speed;

		Truck() {
			System.out.println("Truck클래스 호출");
		}

		void speedUp(int speed) {
			this.speed += speed;
		}

		void carCall() {
			/*
			 * 정적 클래스의 메소드에서
			 * 바깥 클래스의 필드와 메소드 접근 안됨
			 * (정적(static)클래스에서 일반클래스로 바로 접근 안됨)
			 * company = "현대";
			 * stop();
			 */
			color = "빨강";
			stop2();
			// 바깥 클래스의 static 필드와 메소드는 접근 가능함
		}

	}

	void speedUp(int speed) {
		// 매개변수 1개 리턴 X 메소드
		this.speed += speed;
	}

	void speedDown(int speed) {
		// 매개변수 1개 리턴 X 메소드
		this.speed -= speed;
	}

	void stop() {
		System.out.println("Car 멈춤");
	}
	
	static void stop2() {
		System.out.println("Car 멈춤");
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
