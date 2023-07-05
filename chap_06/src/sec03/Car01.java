package sec03;

public class Car01 {
	//필드
	String company;
	String model;
	String color;
	int maxSpeed;
	int speed;
	
	public Car01() {
		/*
		 * 기본 생성자 -> 보통 맨 위에 생성함
		 * 위에 있는걸 모두 쓰고 싶다면 기본 생성자 만들면 사용 가능.
		 * <생성자를 만들지 않으면 컴퓨터에서 자동으로 생성해줌>
		 */
	}
	
	public Car01(String model, int speed) { 
		/*
		모델명과 속도가 들어가는 생성자 만듦
		생성자가 하나 있으므로 컴퓨터가 자동으로 만들지 않음
		*/
		
	}
}
/* 
 * <클래스의 구성 멤버>
 * ex)
 * public class ClassName {
 * int fieldname;   -> 필드 : 객체 데이터가 저장되는곳
 * ClassName() {...}  -> 생성자 : 객체 생성 시 초기화 역할 담당
 * void methodName() {...}  -> 메소드 : 객체의 동작에 해당하는 실행 블록
 * }
 */