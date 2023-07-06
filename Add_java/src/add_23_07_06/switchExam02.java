package add_23_07_06;

import java.util.Scanner;

public class switchExam02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("학과 코드 입력 : "); // 학과코드는 A123, B123,...
		String code = sc.next();

		char co = code.charAt(0);

		switch (co) {
			case 'A':
			case 'a':
				System.out.println("법학과 학생입니다.");
				break;

			case 'B':
			case 'b':
				System.out.println("경영학과 학생입니다.");
				break;

			case 'C':
			case 'c':
				System.out.println("국문학과 학생입니다.");
				break;

			default:
				System.out.println("잘못된 코드입니다. 다시 입력하세요.");
		}
		/*
		 * 학과코드의 첫자리가 A : 법학과, B : 경영학과, C : 국문학과 사용자가 A123 입력시 법학과 학생입니다. 출력
		 */
	}

}
