package sec02;

public class Car {
	// 인터페이스 타입 필드 선언과 초기 구현 객체 대입
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	/*
	 * Tire 인터페이스로 자동 변환 되었으나
	 * 오버라이드 된 roll 메소드는 가지고 넘어감
	 */
	

	void run() {
		// 인터페이스에서 설명된 roll() 메소드 호출
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}
