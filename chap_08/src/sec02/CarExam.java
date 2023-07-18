package sec02;

public class CarExam {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run(); 
		// 한국타이어 메소드 4개 호출
		System.out.println();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		myCar.run();
		// 금호타이어 2개 한국타이어 2개 호출
	}

}
