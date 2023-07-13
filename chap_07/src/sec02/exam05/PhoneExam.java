package sec02.exam05;

public class PhoneExam {

	public static void main(String[] args) {
		Phone p = new SmartPhone();
		// 자식 객체를 부모 객체에 타입 변환 시킴(자동 변환)
		System.out.println(p.cost); // 중복 이름의 필드는 부모 객체 출력

		p.powerOn(); // 부모 객체
		p.ring(); // 자식 객체(오버라이드 메소드 호출)

		// p.videoOn(); -> 자식 클래스 메소드 호출 안됨
		// p.phoneCase = "하드케이스"; -> 자식클래스 필드 사용 안됨

		SmartPhone sp = (SmartPhone) p;
		// 부모 객체를 자식 객체에 강제 타입 변환시킴
		sp.phoneCase = "소프트케이스"; // 자식 객체 필드나 메소드 사용 가능
		sp.powerOn(); // 부모 객체 필드나 메소드 사용 가능(상속 받았기 때문)
		System.out.println(sp.cost); // 중복 이름의 필드는 자식 객체 출력
		
		/*
		Phone p2 = new Phone()
		SmartPhone sp2 = (SmartPhone)p2;
		System.out.println(sp2.cost);
		자식 타입이 부모 타입으로 변환하지 않은 상태에서
		부모 타입을 자식 타입으로 강제 변환은 되지 않음
		*/
	}

}
/* 
 * <부모 타입을 자식 타입으로 변환>
 * 조건 : 자식 타입이 부모 타입으로 자동 타입 변환한 후 다시 반대로 변환할 때 사용
 * 
 * ex. 자식타입 변수 = (자식타입) 부모타입;
 * -> 부모 타입을 자식 타입으로 변환
 * 
 * ex. Parent parent =  new Child(); // 자동 타입 변환
 * Child child = (child) parent; //  강제 타입 변환
 */