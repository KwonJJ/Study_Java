package sec02;

public class Anonymous {
	
	Person field = new Person() { // 익명 객체 생성(필드 값으로 익명 객체 대입)
		// 필드 초기값으로 대입

		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
		
	};
	
	void method1() { // 메소드 내부 익명 객체(로컬 변수값으로 익명 객체 대입)
		// 로컬 변수 값으로 대입
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			}
		};
		
	localVar.wake(); // 로컬 변수 사용
	}
	
	void method2(Person person) {
		person.wake();
	}
}
