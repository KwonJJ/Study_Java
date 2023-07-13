package sec03;

public abstract class Phone {
	public String owner; // 소유자 필드

	public Phone(String owner) { // 생성자
		this.owner = owner;
	}
	
	public void turnOn() {
		// 리턴 X, 매개변수 X 메소드
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		// 리턴 X, 매개변수 X 메소드
		System.out.println("폰 전원을 끕니다.");
	}
	
}
/* 
 * 추상 클래스
 * 여러 클래스의 공통된 특성(필드, 메소드)를 추출해서 선언한 것으로 추상 클래스라고 함.
 * 1. 실체 클래스(객체 생성용 클래스)들의 공통적인 특성(필드, 메소드)을 추출하여 선언한것
 * 2. 추상 클래스와 실체 클래스는 부모, 자식 클래스로서 상속 관계를 가짐
 * 
 * 선언방법
 * public abstract class 클래스{
 * // 필드
 * // 생성자
 * // 메소드
 * }
 * 
 * 직접 객체를 생성할 수 없지만 자식 객체 생성될 때 객체화 됨
 * 자식 생성자에서 super(...)형태로 추상 클래스의 생성자 호출
 */