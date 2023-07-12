package sec02.exam01;

public class CarExam {

	public static void main(String[] args) {
		Truck truck = new Truck("빨강", "벤츠", 3, "중");
		
		Car car = truck; // 자동 타입 변환(truck이 부모(Car)클래스의 car로 자동 타입 변환)
		
		car.speedUp(30); // 부모 메소드 호출
		// car.maxSpeed(50); -> 자식(truck)의 타입이 변환되었기 때문에 자식 메소드 호출 불가능(컴파일 에러)
		
		car.start(); // 자식(truck) 메소드이지만 오버라이딩했기 때문에 호출 가능
	}

}
