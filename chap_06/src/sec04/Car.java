package sec04;

public class Car {
	private int speed = 100;

	void poewrOn() {
		System.out.println("시동이 켜졌습니다.");
	}
	
	void powerOff() {
		System.out.println("시동이 꺼졌습니다.");
	}
	
	
	public int speedUp(int x) {
		speed += x;
		return speed;
	}
	
	public int speedDown(int x) {
		speed -= x;
		return speed;
	}
	
	public int breakZero() {
		speed = 0;
		return speed;
	}
}
/*
 * Car 클래스 생성
 * 멤버 변수 생성
 * 기본 스피드 100으로 설정(private으로 설정)
 * 10씩 증가
 * 증가하면 속도에 증가시키고 속도 출력
 * ex) 현재 속도는 110입니다. 출력
 * 10씩 감소
 * 감소하면 속도에 감소시키고 속도 출력
 * ex) 현재 속도는 100입니다. 출력
 * 
 * 메소드
 * 시동걸기 powerOn
 * 시동끄기 powerOff
 * 1. 속도증가 speedup
 * 2. 속도감소 speedDown
 * 3. 멈춤 breakZero
 * 
 * 실행구문 CarExample
 * 시동걸기 -> 속도증가 2번 -> 속도감소 1번 ->
 * 멈춤 -> 시동끄기
 */