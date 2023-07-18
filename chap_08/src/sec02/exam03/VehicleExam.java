package sec02.exam03;

public class VehicleExam {

	public static void main(String[] args) {
		
		Vehicle vehicle = new Bus();
		
		vehicle.run(); // 오버라이드 된 run 호출 가능
		// vehicle.stop(); -> 구현 객체 메소드 바로 호출 불가능(오버라이드 안됨)
		
		Bus bus = (Bus) vehicle; // 구현 객체 타입으로 강제 변환
		bus.stop(); // 구현 객체 메소드 호출 가능(구현 객체 타입으로 강제 변환 해야 호출 가능)
		
		/*
		 * Vehicle vehicle2 = new Vehicle(); -> 오류 발생
		 * 인터페이스는 객체 생성이 불가능함. 생성자 X
		 * Bus bus2 = (Bus)vehicle2;
		 * bus2.run();
		 * bus2.stop();
		*/
	}

}
