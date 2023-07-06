package sec04;

public class 계산기예제01 {

	public static void main(String[] args) {
		계산기 myCalc = new 계산기(); // 계산기 클래스에 대한 객체 생성
		myCalc.powerOn();
		
		int result1 = myCalc.plus(3, 5);
		System.out.println(result1);
		
		int result2 = myCalc.minus(3, 5);
		System.out.println(result2);
		
		String result3 = myCalc.mul(3, 5);
		System.out.println(result3);
		
		String result4 = myCalc.mul(0, 5);
		System.out.println(result4);
		
		double result5 = myCalc.divide(5, 2);
		System.out.println(result5);
		
		byte x = 10;
		byte y = 4;
		double result6 = myCalc.divide(x, y);
		System.out.println(result6);
		
		myCalc.powerOff();
	}

}
