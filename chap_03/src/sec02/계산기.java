package sec02;

import java.util.Scanner;

public class 계산기 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("숫자 2개 입력 : ");
		int a = s.nextInt();
		int b = s.nextInt();

		System.out.println("연산자 입력(+, -, *, /) : ");
		String q = s.next();
		;

		int temp;
		if (b > a) { // a, b값 치환(a가 b보다 작아도 값을 치환해서 양수로 출력)
			temp = a;
			a = b;
			b = temp;
		}
		if (q.equals("+")) {
			int p = a + b;
			System.out.println("덧셈 결과 = " + p);
		}
		if (q.equals("-")) {
			int m = a - b;
			System.out.println("뺄셈 결과 = " + m);
		}
		if (q.equals("*")) {
			int x = a * b;
			System.out.println("곱셉 결과 = " + x);
		}
		if (q.equals("/")) {
			double y = (double)a / b;
			System.out.println("나눗셈 결과 = " + y); // 소수점까지 나오게 double로 형변환
		}
		
		s.close();
	}
	

}
/* 숫자 2개를 입력 받기
 * 연산자를 입력 받기(+, -, *, /)
 * 
 * ex)5, 2, + = 7
 *    2, 5, - = 3
 *    5, 2, * = 10
 *    5, 2, / = 2.5
 * */
