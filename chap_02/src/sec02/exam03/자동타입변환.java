package sec02.exam03;


public class 자동타입변환 {

	public static void main(String[] args) {
		byte a = 10;
		int b = a;
		System.out.println(b);
		
		long longValue = 5000000000L; //정수 타입이 실수 타입으로 저장될 경우 자동으로 실수로 변환
		double doubleValue = longValue; //5.0E9로 저장됨
		System.out.println(longValue);
		System.out.println(doubleValue);
	}

}
