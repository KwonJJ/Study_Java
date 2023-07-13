package sec02.exam06;

public class InstanceofExam {

	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);

		Parent parentB = new Parent();
		method1(parentB);
		
	}
	
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 -> Child로 강제 변환 성공");
		} else {
			System.out.println("method1 -> Child로 강제 변환 실패");
		}
	}

}
/* 
 * instansceof연산자
 * 어떤 객체가 어느 클래스의 인스턴스인지 확인
 * ex. boolean result = 좌향(객체) instanceof 우향(타입)
 */