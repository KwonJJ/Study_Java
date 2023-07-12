package sec01.exam06;

public class SportsCar extends Car {

	@Override
	public void speedUp() {
		speed += 10;
	}
	/*
	@Override
	public void stop() { // final 메소드 오버라이드 불가능(재정의 할 수 없음)
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	*/
	public void stop(int x) { 
		// 리턴값이나 매개변수를 변경하면 메소드 오버라이드 X(아님)
		System.out.println("스포츠카를 멈춤");
		speed = 0;
	}
	
}
