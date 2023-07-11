package sec01;

public class SupersonicAirplane extends AirPlane{
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	//정적 상수 2개 생성, 상수 이름은 관례가 대문자
	
	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		} else {
			super.fly(); // 부모의 fly() 메소드 호출, 일반 비행
		}
	}
	
	

}
