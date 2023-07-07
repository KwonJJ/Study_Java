package sec04;

public class SuperCar {
	int speed;

	int getSpeed() { // 현재 속도를 리턴시키는 메소드
		return speed;
	}

	void KeyTurnOn() { // 시동거는 메소드, 리턴X
		System.out.println("키를 돌립니다.");
	}

	void run() { // 0부터 50까지 10씩 증가
		for (int i = 0; i <= 50; i += 10) { // 6번 반복하여 현재 속도 출력, 리턴값 X
			speed = i;
			System.out.println("달립니다.(시속 : " + speed + "km/h");
		}
	}
}
