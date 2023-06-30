package sec03.exam02;

public class CastingExample {
	/*
	 * 강제 타입 변환(casting)
	 * 큰 허용 범위 타입을 작은 허용 범위 타입으로 강제로 난누어 한 조각만 저장
	 * char타입으로 변환하는 이유 = 문자를 출력할 수 있기 때문
	 * 
	 * 실수타입(float, double)은 정수타입(byte, short, int, long)으로 자동변환 X
	 * 소수점 이하 부분은 버려지고 정수 부분만 저장
	 * */

	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char)intValue;
		
		System.out.println(charValue);
		
        /*
		 * 실수타입(float, double)은 정수타입(byte, short, int, long)으로 자동변환 X
		 * 소수점 이하 부분은 버려지고 정수 부분만 저장
		 * */
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
		/*
		 * byte, short 타입의 변수는 int 타입으로 자동 변환되어 연산을 수행
		 * 피 연산자 중 하나가 long타입이면 다른 피연산자는 long타입으로 자동변환
		 */
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10, y = 20;
		//byte result2 = x_y; -> 컴파일 에러 발생(int 타입을 byte로 변환 불가)
		int result2 = x+y;
		System.out.println(result2);
	}

}
