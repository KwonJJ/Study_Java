package sec03;

public class PhoneExam {

	public static void main(String[] args) {
		// Phone phone = new Phone("홍길동"); -> 에러 (추상 클래스는 직접 객체 생성이 안됨.)
		
		SmartPhone smartphone = new SmartPhone("홍길동", 1200000); 
		
		smartphone.turnOn(); // 추상 클래스의 메소드
		smartphone.internetSearch(); // 객체(자기) 매소드
	}

}
