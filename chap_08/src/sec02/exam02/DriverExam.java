package sec02.exam02;

public class DriverExam {

	public static void main(String[] args) {
		Driver driver = new Driver(); // Driver 객체 생성
		
		Bus bus = new Bus(); // Bus 객체 생성
		Taxi taxi = new Taxi(); // Taxi 객체 생성
		
		driver.drive(bus); // 자동 타입 변환 : Vehicle vehicle = bus; 와 동일
		/*
		 * bus 객체를 매개변수로 넘겨줌
		 * bus는 Vehicle 인터페이스의 구현 객체이므로
		 * Vehicle 타입으로 자동 변환되어 들어감 
		 */
		driver.drive(taxi); // 자동 타입 변환 : Vehicle vehicle = taxi; 와 동일
		
		// driver.stop(); 
		/* -> 오류 발생
		 * bus는 Vehicle타입으로 자동 변환되어 오버라이드된 run은 사용 가능하지만 stop는 사용 불가능
		 */
		
	}

}
