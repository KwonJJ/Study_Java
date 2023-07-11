package sec01.exam02;

public class SuperCar extends Car { // SuperCar클래스에 Car(부모)클래스 상속
	int maxSpeed; // 최고속도
	String engine; // 엔진
	
	public SuperCar(String model, String company, int maxSpeed) { // 부모(Car) 파라미터 2개, 자기(SuperCar) 파리미터 1개
		super(model, company); // 부모(Car) 생성자 호출
		this.maxSpeed = maxSpeed;
	}
	
	
}
