package sec02;

public class 타입변환예제01 {

	public static void main(String[] args) {
		Car car = new Car();
		Sedan sedan = new Sedan();
		Sonata sonata = new Sonata();
		
		Car car2 = sedan; 
		/*
		 * sedan 클래스 타입은 Car 클래스의 자식 클래스 이므로
		 * sedan 클래스 타입이 Car 클래스 타입으로 자동 변환됨.
		 */
		
		Car car3 = sonata;
		/*
		 * sonata 클래스 타입은 Car 클래스의 자손 클래스이므로
		 * sonata 클래스 타입 또한 Car 클래스 타입으로 자동 변환됨.
		 */

		// Truck truck = sonata; -> (컴파일 에러)truck 클래스 타입은 sonata 클래스와 연관되지 않아 자동 변환 안됨.
	}

}
/* 
 * 자동 타입 변환
 * 왼쪽 : 큰거, 오른쪽 작은거
 * -> 부모타입 변수 = 자식타입;
 * 
 * ex.<정석방식> 
 * Cat cat = new Cat();
 * Animal animal = cat;
 * => Animal animal = new Cat();도 가능(보통 이렇게 씀)
 * 
 * 바로 위 부모가 아니더라도 상속 계층에서 상위 타입인 경우 자동 타입 변환 일어날 수 있음
 * 
 * 1. 부모 타입으로 자동 타입 변환 이후에는 부모 클래스에 선언된 필드 및 메소드만 접근 가능
 * 2. 예외적으로 메소드가 자식 클래스에서 재정의될 경우 자식 클래스의 메소드가 대신 호출
 */