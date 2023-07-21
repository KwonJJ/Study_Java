package sec02.exam02;

public class RemoteExam {

	public static void main(String[] args) {
		Remote re = new Remote();
		re.rc.turnOn(); // 익명 객체 필드 사용
		re.rc.turnOff(); // 익명 객체 필드 사용

		re.method1(); // 익명 객체 메소드 내부 로컬 변수 사용
		
		re.method2(new RemoteControl() {
			// 매개변수로 익명 구현 객체 사용

			@Override
			public void turnOn() {
				System.out.println("스마트 TV를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("스마트 TV를 끕니다.");
			}
			
		});
	}

}
