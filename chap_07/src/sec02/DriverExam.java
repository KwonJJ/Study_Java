package sec02;

public class DriverExam {

	public static void main(String[] args) {
		Driver driver = new Driver(); // Driver 클래스 객체 생성
		Bus bus = new Bus(); // Bus 클래스 객체 생성
		Taxi taxi = new Taxi(); // Taxi 클래스 객체 생성
		// 위 객체들은 각각의 필드와 메소드 사용 가능(private선언이 안되어 있는것만 가능)
		
		bus.run();
		
		//driver.drive(); -> 컴파일 에러(drive메소드는 매개변수가 있어야함.)
		driver.drive(bus); // 클래스 타입의 매개변수 추가함
		
		driver.drive(taxi); // 클래스 타입의 매개변수 추가함
		

	}

}
