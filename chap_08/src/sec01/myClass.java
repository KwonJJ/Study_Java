package sec01;

public class myClass {
	RemoteControl rc = new Television(); // 필드
	
	myClass(){ 
		// 디폴트 생성자
		// 디폴트 생성자 호출 시 Television에서 구현된 메소드 호출
		
	}
	
	myClass(RemoteControl rc){
		// 인터페이스를 매개변수로 하는 생성자
		// 매개변수 객체의 메소드 호출
		this.rc = rc;
		rc.turnOn(); // Television에서 구현된 turnOn 호출
		rc.setVolume(5); // Television에서 구현된 setVolume 호출
		rc.turnOff(); // Television에서 구현된 turnOff 호출
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		// Audio 객체의 메소드 호출
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}

	void methodB(RemoteControl rc) {
		// 매개변수 객체의 메소드 호출
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
	}
}
