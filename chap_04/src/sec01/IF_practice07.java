package sec01;

import java.util.Scanner;

public class IF_practice07 {

	public static void main(String[] args) {

		// int 타입의 변수 num을 선언하고 키보드로 값을 입력받으세요
		// num이 홀수인지 짝수인지 판별하세요 (if - else문 사용)

		Scanner s = new Scanner(System.in);
		System.out.print("국어: ");
		int a = s.nextInt();
		System.out.print("수학: ");
		int b = s.nextInt();
		System.out.print("영어: ");
		int c = s.nextInt();
		int sum = a + b + c;

		// if ( a>6 && b>6 && c>6 && sum>=30)도 맞음
		if (a <= 6 || b <= 6 || c <= 6 || sum < 30) {
			System.out.println("결과 : 불합격입니다.");
		} else {
			System.out.println("결과 : 합격입니다.");
		}
		s.close();
	}
}