package sec02;

import java.util.Scanner;

public class 확인문제02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 수 : ");
		String a = s.next();

		System.out.println("두 번째 수 :");
		String b = s.next();

		double x = Double.valueOf(a);
		double y = Double.valueOf(b);
		double result = x / y;

		if (y == 0 || y == 0.0) { //double로 선언 했기 떄문에 0은 0.0으로 자동변환되서 0.0만 조건으로 해도 괜찮음.
			System.out.println("결과 : 무한대");
		} else {
			System.out.println("결과 = " + result);
		}
		
		/*
		//강사님 방식
		System.out.println("첫 번째 수 :");
		double n1 = Double.parseDouble(s.next());
		System.out.println("두 번째 수 :");
		double n2 = Double.parseDouble(s.next());
		
		System.out.println("--------------------");
		if(n2 != 0.0) { //double로 선언 했기 떄문에 0은 0.0으로 자동변환되서 0.0만 조건으로 해도 괜찮음.
			System.out.println("결과 : " + (n1 / n2));
		}else {
			System.out.println("결과  : 무한대");
		}
		*/
		s.close();
	}
	/* 실수 2개 입력
	 * 첫번 째 수에 두번째 수를 나눈 결과를 "결과 : 값"으로 출력하되
	 * 두번 째 수에 0 또는 0.0이 입력되었을 시 "결과 : 무한대"가 출력
	 * Scanner.next();사용
	 */

}
