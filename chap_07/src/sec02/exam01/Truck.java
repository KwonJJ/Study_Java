package sec02.exam01;

public class Truck extends Car{
	int weight; // 적재 용량 필드
	String trunkSize; // 트렁크 크기 필드 (ex. 대, 중, 소)
	int maxSpeed; //트럭 최고속도 필드
	
	public Truck(String color, String company, int weight, String trunkSize) { 
		// Truck 생성자(부모(Car) 매개변수 2개, 자기(Truck) 매개변수 2개)
		super(color, company); // 부모(Car) 생성자
		this.weight = weight;
		this.trunkSize = trunkSize;
	}
	
	void maxSpeed(int maxSpeed) {
		// 매개변수 int 1개짜리 고유 메소드, 리턴타입 X
		this.maxSpeed += maxSpeed;
	}

	@Override
	void start() { // 오버라이드(부모(Car)클래스의 start 출력구문 변경)
		System.out.println("트럭이 출발했습니다.");
	}

	@Override
	void stop() { // 오버라이드(부모(Car)클래스의 stop 출력구문 변경)
		System.out.println("트럭을 멉춥니다.");
	}
	
	
	
}
