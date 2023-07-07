package sec04;

public class SuperCarExam01 {

	public static void main(String[] args) {
		SuperCar myCar = new SuperCar();

		myCar.KeyTurnOn();
		myCar.run();

		int speed = myCar.getSpeed(); // 모두 외부호출
		System.out.println("현재 속도 : " + speed + "km/h");
	}

}
