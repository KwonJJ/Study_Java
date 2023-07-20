package sec02;

public class AnonymousExam {

	public static void main(String[] args) {

		Anonymous anony = new Anonymous(); // 익명 객체 필드 사용

		anony.field.wake(); // 익명 객체 로컬 변수 사용

		anony.method1(); // 익명 객체 매개값 사용

		anony.method2(new Person() {
			/* 
			 * method2는 매개변수로 Person클래스 타입을 넘겨줘야함.
			 * 매개변수는 마지막에 ;(세미콜론) 사용안함
			 */
			void study() {
				System.out.println("공부합니다.");
			}

			@Override
			void wake() {
				/*
				 * 오버라이드 안된 메소드를 바로 호출 안되기 때문에
				 * 이중으로 메소드를 호출함
				 */
				System.out.println("8시에 일어납니다.");
				study();
			}

		});

	}

}
