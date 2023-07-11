package sec01;

public class CellPhone { 
	// 필드
	String model;
	String color;
	
	//생성자는 default(기본 생성자)
	//CellPhone(){}와 동일
	
	// 메소드
	void powerOn() {System.out.println("전원을 켭니다. ");}
	void powerOff() {System.out.println("전원을 끕니다. ");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("자기 : " + message);}
	void receiveVoice(String message) {System.out.println("상대방 : " + message);}
	void hangUp() {System.out.println("전화를 끊습니다. ");}
	
}
/* 
 * <상속> -> extends 부모클래스
 * ex) public class B extends A
 * ->(B클래스에) A를 상속
 * 
 * 특징
 * 1. 여러 개의 부모 클래스 상속 불가능
 * 2. 부모 클래스에서 ptivate 접근 제한 갖는 필드와 메소드는 상속 대상에서 제외
 * 3. 부모와 자식 클래스가 다른 패키지에 존재할 경우 default접근 제한된 필드와 메소드도 제외
 */