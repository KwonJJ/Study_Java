package sec01;

public interface RemoteControl {
	/*
	public int s = 3; -> 인터페이스 필드 올바른 사용 방법이 아님
	인터페이스 필드는 상수 필드만 사용 가능하므로 필드 이름을 대문자르 쓰는 것이 관례
	*/
	public int MIN_VOLUME = 0;
	public int MAX_VOLUME = 10; 
	/*
	상수 필드 : 한번 지정 후 불러올 목적으로만 사용(바꾸기 위한 목적이 아님)
	*/

	/*
	public String NAME; -> 상수 필드는 반드시 초기값을 넣어줘야함
	*/
	public String NAME = "홍길동";
	
	void turnOn();
	void turnOff();
	public void setVolume(int volume);
	// 인터페이스 메소드는 추상 메소드로 구현함.
}
/* 
 * 인터페이스는 객체 생성 X, 생성자 가질 수 없음'
 * 
 * 인터페이스 변수 선언하고 구현 객체를 대입
 * 
 * ex.
 * 인터페이스 변수;
 * 변수 = 구현객체;
 */