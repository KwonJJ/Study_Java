package sec02;

import java.util.Scanner;

public class 복합대입연산자 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = 100;

		System.out.println("숫자 입력 : ");
		int x = s.nextInt();

		System.out.println("연산자 입력(+, -, *, /, %) : ");
		String q = s.next();

		if (q.equals("+")) {
			n1 += x;
		}
		if (q.equals("-")) {
			n1 -= x;
		}
		if (q.equals("*")) {
			n1 *= x;
		}
		if (q.equals("/")) {
			n1 /= x;
		}
		if (q.equals("%")) {
			n1 %= x;
		}
		System.out.println("결과 = " + n1);

		s.close();
	}
	/*
	 * ex) 숫자 5, 연산자 - 입력했으면 복합연산자를 이용하여 100에서 5를 뺀 num1의 결과를 출력(num -= 5;)
	 */

}