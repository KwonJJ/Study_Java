package sec01;

import java.util.Scanner;

public class IF_practice06 {

	public static void main(String[] args) {
		
		// int 타입의 변수 num을 선언하고 키보드로 값을 입력받으세요
		// num이 홀수인지 짝수인지 판별하세요 (if - else문 사용)
		
		Scanner s = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int num = s.nextInt();
		
		if (num % 2 == 0) {
			System.out.println(num +"는(은) 짝수입니다.");
		} else {
			System.out.println(num +"는(은) 홀수입니다.");
		}
		s.close();
	}

}