package sec02;

public class Car01Exam {

	public static void main(String[] args) {
		Car01_2 car01_2 = new Car01_2();
		
		car01_2.car01.stop();
		// 익명객체에서 오버라이드 된 stop만 호출 가능
		car01_2.speedDown();
	}

}
