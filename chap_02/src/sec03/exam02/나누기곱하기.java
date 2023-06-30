package sec03.exam02;

import java.util.Scanner;

public class 나누기곱하기 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자 입력 : ");
		int a = s.nextInt();
		
		System.out.println("두 번째 숫자 입력 : ");
		int b = s.nextInt();
		
		System.out.println("연산 기호를 입력(*, /) : ");
		String c = s.next();
		char d = c.charAt(0);
		
		if(d == '*') {
			System.out.println("입력하신 연산의 결과 = " + a * b);
		}
		else {
			double e = (double) a / b; //정수 a, b를 double로 변환
			System.out.println("입력하신 연산의 결과 = " + e + "입니다.");
		}
		s.close();
	}

}

/*첫 번째 숫자를 입력하세요. Scanner, if 필요
 *ex) 30
 *두 번재 숫자를 입력하세요.
 *ex) 50
 *연산기호를 입력하세요(*, /) Srting으로 받아서 charAt로 변경
 *ex) *
 *출력 -> 입력하신 연산의 결과 = 1500입니다.
 */