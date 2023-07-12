package sec02;

public class Car02 {
	// 객체 타입의 필드(필드의 다형성)
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRigntTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);

	// 메소드
	int run() {
		System.out.println("자동차가 달립니다.");
		if (frontLeftTire.roll() == false) {
			stop();
			return 1;
		}
		if (frontRigntTire.roll() == false) {
			stop();
			return 2;
		}
		if (backLeftTire.roll() == false) {
			stop();
			return 3;
		}
		if (backRightTire.roll() == false) {
			stop();
			return 4;
		}
		return 0;
	}

	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
