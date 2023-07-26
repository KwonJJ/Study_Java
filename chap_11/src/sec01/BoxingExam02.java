package sec01;

public class BoxingExam02 {

	public static void main(String[] args) {

		// Integer obj = new Integer(100); -> 정식 박싱 코드
		// 대입값이 int 타입이면 자동으로 박싱해줌.
		Integer obj = 100; // Wrapper 클래스 타입
		System.out.println(obj);
		
		// int value = obj.intValue(); -> 정식 언박싱 코드
		// 대입값이 int타입이면 자동으로 언박싱해줌.
		int value = obj;
		System.out.println(value);

		/*
		Integer obj2 = new Integer("100");
		int value2 = Integer.parseInt(obj2); -> 컴파일에러
		Integer.parseInt는 String타입을 Int타입으로 변경
		obj2가 String타입이 아니므로 사용 불가능
		*/
		
		Integer obj2 = new Integer("100"); // Wrapper 클래스 타입0
		int value2 = Integer.valueOf(obj2); // valueOf를 이용해야 사용 가능함
	}

}
