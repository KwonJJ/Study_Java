package sec01;

import java.util.Scanner;

public class IF_practice12 {

	public static void main(String[] args) {

		int num = (int) (Math.random() * 6) + 1; // 6개의 랜덤 숫자 생성 ( +1 = 1 ~ 6)
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 (1~6)");
		int num2 = s.nextInt();

		System.out.println("컴퓨터 수 :" + num);
		System.out.println("사용자 수 :" + num2);

		if (num == num2) {
			System.out.println("두 수가 일치합니다.");
		} else if (num > num2) {
			System.out.println("컴퓨터 숫자가 더 큽니다.");
		} else if (num < num2) {
			System.out.println("사용자 숫자가 더 큽니다.");
		}
		s.close();
	}
}