package sec02.exam02;

public class Remote {
	
	
	RemoteControl rc = new RemoteControl() { // 익명 구현 객체 생성

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
			
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
		
	};
	
	void method1() {
		// 메소드 내부 로컬 변수로 익명 구현 객체 사용
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("오디오를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다.");
			}
			
		};
		
		// 익명 구현객체 내부 메소드는 외부 메소드에서 반드시 호출해줘야함
		localVar.turnOn();
		localVar.turnOff();
	}
	
	void method2(RemoteControl rc) {
		// 매개변수로 익명구현객체를 사용하는 메소드
		rc.turnOn();
		rc.turnOff();
	}
}
