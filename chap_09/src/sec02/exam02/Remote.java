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
}
