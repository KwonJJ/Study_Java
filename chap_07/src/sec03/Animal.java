package sec03;

public abstract class Animal {
	// 추상 클래스
	public String kind; // 동물 종류 필드

	public void breathe() { // 메소드
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();
	// 추상 메소드
}
/* 
 * 추상 메소드
 * 1. 메소드 선언만 통일하고 실행 내용은 실체 클래스마다 달라야 하는 경우
 * 2. abstract 키워드로 선언되고 중괄호가 없는 메소드
 * 3. 하위 클래스는 반드시 재정의해서 실행 내용을 채워야함.
 * -> [public | protected] abstract 리턴타임 메소드이름(매개변수, ...)
 */