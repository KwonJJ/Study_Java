package sec03.exam01;

public class PromotionExample01 {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue = " + intValue);
		
		char charValue = '사'; //해당 문자의 유니코드 구하는 코드
		intValue = charValue;
		System.out.println("사의 유니코드 = " + intValue);
		
		intValue = 50;
		long longValue = intValue; //int형태의 변수 intValue가 long형태로 자동형변화
		System.out.println("longValue : " + intValue);
		
		longValue = 100;
		float floatValue = longValue; //long형태의 변수 longValue가 float형태로 자동형변화
		System.out.println("floateValue : " + floatValue);
		
		/*
		 * 강제 타입 변환(casting)
		 * 큰 허용 범위 타입을 작은 허용 범위 타입으로 강제로 난누어 한 조각만 저장
		 * char타입으로 변환하는 이유 = 문자를 출력할 수 있기 때문
		 * */
	}
}
