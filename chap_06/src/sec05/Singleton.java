package sec05;

public class Singleton {
	private static Singleton singleton = new Singleton();

	private Singleton() { // 생성자
	}

	static Singleton getInstance() {
		return singleton;
	}

	public static void main(String[] args) {
		/*
		 * Singleton obj1 = new Singleton();
		 * Singleton obj2 = new Singleton();
		 */

		Singleton obj1 = Singleton.getInstance(); // obj1, obj2 -> 같은 객체를 참조
		Singleton obj2 = Singleton.getInstance(); // obj1, obj2 -> 같은 객체를 참조

		if (obj1 == obj2) {
			System.out.println("같은 객체");
		} else {
			System.out.println("다른 객체");
		}

	}

}
/*
 * <싱글톤>
 * 전체 프로그램에서 단 하나의 객체만 만들도록 보장하는 코딩 기법
 * 
 * 싱글톤 작성 방법
 * 1.클래스 외부에서 new연산자 통해 생상자 호출하는 것 불가하도록 private 접근 제한자 사용
 * 
 * 2. 자신의 타입인 정적 필드 선언 후 자신의 객체 생성해 초기화
 * 
 * 3. 외부에서 호출할 수 있는 getInstance()선언
 * 
 * 4. 정적 필드에서 참조하는 자신의 객체 리턴
 */ 
