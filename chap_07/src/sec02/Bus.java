package sec02;

public class Bus extends Vehicle{

	// 부모 클래스의 run 메소드 오바라이드(재정의)
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
	
}
