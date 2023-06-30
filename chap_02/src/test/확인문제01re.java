package test;

import java.util.Scanner;

public class 확인문제01re {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("당신의 이름은? ");
		String name = s.next();

		System.out.println("중간고사 점수는? "); // ex)83.67
		double mid = s.nextDouble();

		System.out.println("기말고사 점수는? ");
		double end = s.nextDouble();

		System.out.println("리포트 점수는? ");
		double report = s.nextDouble();

		double avg = (mid + end + report) / 3; // 괄호안에서 먼저 계산 해야 정상적으로 평균 값 출력됨.

		System.out.printf("%s님의 평균 점수 = %5.2f", name, avg);
		
		s.close();

	}

}
/*
 * Scanner 활용 입력 할 때 소수점 두자리까지 입력 printf 사용해서 한번에 출력 ex)홍길동님의 평균 점수는 = 73.25입니다.
 */
