package sec02.exam03;

import java.util.Scanner;

public class 응용문제02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요 >>");
		System.out.println("첫 번째 숫자는 무엇인가요?");
		
		int a = s.nextInt(); //숫자 입력

		System.out.println("두 번째 숫자는 무엇인가요?");
		
		int b = s.nextInt(); //숫자 입력
		
		int div = a / b;
		System.out.println("입력하신 두 수의 나눈 값 = " + div + "입니다.");
		
		s.close();
	}

}
