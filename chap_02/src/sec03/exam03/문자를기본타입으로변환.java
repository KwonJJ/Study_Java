package sec03.exam03;

import java.util.Scanner;

public class 문자를기본타입으로변환 {
	/* 피연산자가 모두 숫자일 경우 덧셈 연산
	 * 피연산자 중 하나가 문자열일 경우 나머지 피연산자도 문자열로 자동 변환되고 문자열 결합 연산
	 * 
	 * +연산은 앞에서부터 순차적으로 수행
	 * 
	 * Integer.parseInt -> 문자열을 숫자(int)로 변환
	 * String.valueOf(타입값) -> 타입값 -> 문자로 변환
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("숫자 2개 입력 : ");
		String a = s.next();
		String b = s.next();
		
		int c = Integer.parseInt(a); //문자열을 숫자 형태로 변환
		int d = Integer.parseInt(b); //문자열을 숫자 형태로 변환
		int sum = c + d;
		System.out.println("두 수의 합계 = " + sum + "입니다.");
		
		s.close();
	}

}
/* 두 수를 입력받습니다
 * 단, next() 이용하여 문자열로 입력받음
 * 입력받은 문자열을 parseInt 이용하여
 * 숫자로 형변환 시키세요
 * 두 숫자의 합계를 출력하세요.
 */