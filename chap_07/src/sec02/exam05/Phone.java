package sec02.exam05;

public class Phone {
	String company; // 제조회사
	int cost = 100000; // 가격
	String color; // 색상
	
	void ring() {
		System.out.println("전화가 울립니다.");
	}
	
	void powerOn() {
		System.out.println("전원이 켜집니다.");
	}
	
	void powerOff() {
		System.out.println("전원이 꺼집니다.");
	}
}

