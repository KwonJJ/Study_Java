package sec02.exam02;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
		// 매개변수가 인터페이스 객체인 메소드
		
		// vehicle.stop(); -> 오버라이드 안된 Bus클래스의 stop은 사용 불가능
	}
}
