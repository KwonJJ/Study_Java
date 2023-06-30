package sec03.exam03;

public class 확인문제 {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = 10;
		char charValue = 'A';
		double doubleValue = 5.7;
		String strValue = "A";

		double var = (double) intValue;
		byte var1 = (byte) intValue;
		int var2 = (int) doubleValue;
		// char var3 = strValue; ->컴파일 에러
		char var3 = strValue.charAt(0); // 문자열을 문자(한글자)로 변경
		// short shortValue = charValue; -> 컴파일 에러

		byte byteValue1 = 10;
		float floatValue = 2.5F;
		double doubleValue1 = 2.5;

		/* byte(컴파일 에러) */int result = byteValue1 + byteValue1; // byte + byte = int로 변환
		int result1 = 5 + byteValue1;
		float result2 = 5 + floatValue;
		double result3 = 5 + doubleValue1;

		char c1 = 'a';
		int c2 = c1 + 1;
		System.out.println((char) c2); // int로 바뀐 c2의 값을 char로 다시 변환해서 유니코드로 출력

		int x = 5, y = 2;
		double result4 = (double) x / y;
		System.out.println(result4);

		double var4 = 3.5;
		double var5 = 2.7;
		int result5 = (int) (var4 + var5);
		System.out.println(result5);

		long var6 = 2L;
		float var7 = 1.8F;
		double var8 = 2.5;
		String var9 = "3.9";
		int result6 = (int) (var6 + var7) + (int) (var8) + (int) Double.parseDouble(var9); // 결과가 8이 나옴
		System.out.println(result6);

		int result7 = (int) (var6 + var7 + var8) + (int) Double.parseDouble(var9); // 결과가 9가 나옴
		System.out.println(result7);

		int result8 = (int) (var6 + var7 + var8 + Double.parseDouble(var9)); // 결과가 10이 나옴
		System.out.println(result8);

		String str = 2 + 3 + "";
		String str1 = 2 + "" + 3;
		String str2 = "" + 2 + 3;

		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);

	}

}
/*
 * */
