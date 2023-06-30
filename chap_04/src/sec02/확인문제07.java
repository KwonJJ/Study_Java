package sec02;

import java.util.Scanner;

public class 확인문제07 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// 잔고는 balance, 예금은 deposit, 출금은 withdraw

		int balance = 500000000; // 통장 잔고는 5억으로 설정
		int deposit, withdraw;
		boolean run = true; // boolean은 true 아니면 false임

		while (run) {
			System.out.println("광주은행에 방문하신 것을 환영합니다.");
			System.out.println("예금은 1번, 출금은 2번, 잔고확인은 3번, 종료는 4번입니다.");
			int choice = s.nextInt();

			switch (choice) {
			case 1:
				System.out.println("입금 금액이 얼마입니까? ");
				deposit = s.nextInt();
				balance += deposit; // 잔고에 입금 금액을 합침
				System.out.printf("현재 잔액은 %d원입니다.", balance);
				break;

			case 2:
				System.out.println("출금 금액이 얼마입니까 ?");
				withdraw = s.nextInt();
				if (balance < withdraw) {
					System.out.println("잔액이 부족합니다.");
				} else {
					balance -= withdraw; // 잔고에서 출금 금액을 뺌
					System.out.printf("현재 잔액은 %d원입니다.", balance);
				}
				break;

			case 3:
				System.out.printf("현재 잔액은 %d원 입니다.\n", balance);
				break;

			default:
				System.out.println("종료되었습니다.");
				run = false;
			}
		}
	}

}
/* while문과 Scanner를 이용해서 입력된 데이터로 
 * 예금, 출금, 조회, 종료 기능을 제공하는 코드 작성
 */