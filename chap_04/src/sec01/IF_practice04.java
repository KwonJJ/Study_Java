package sec01;

import java.util.Scanner;

public class IF_practice04 {

	public static void main(String[] args) {

		// int 타입의 변수 num을 선언하고 키보드로 값을 입력받으세요
		// 만약 num이 3의 배수라면 "3의 배수입니다." 라고 출력하는 프로그램을 만들어보세요. (if문 사용)

		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = s.nextInt();

		if (num % 3 == 0 && num != 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");
		}
		s.close();
	}

}