package sec02;

import java.util.Scanner;

public class 응용문제01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int sum = 0;
		boolean run = true;
		int count = 0;
		while (run) {
			System.out.println("광주시립도서관 방문을 환영합니다. ");

			System.out.print("코드와 책 개수 입력 : ");
			String text = s.next();

			char code1 = text.charAt(0);
			if (code1 == 'a' || code1 == 'A' || code1 == 'b' || code1 == 'B') {
				String code2 = text.substring(1); // String 변수명 -> 변수명.substring(숫자1, 숫자2)->숫자1 자리부터 숫자 2자리 전까지 추출
				count = Integer.parseInt(code2); // String타입의 (문자로 입력한)숫자를 Integer.parseInt(바꿀String변수명)로 int타입으로 바꿈
			}
			switch (code1) {
			case 'A':
			case 'a':
				sum += count;
				System.out.printf("책 %d권 대출\n", sum);
				System.out.printf("현재 대출 상태 : %d\n", sum);
				break;

			case 'B':
			case 'b':
				sum -= count;
				System.out.printf("책 %d권 반납\n", sum);
				System.out.printf("현재 대출 상태 : %d\n", sum);
				break;

			default:
				System.out.println("종료");
				run = false;

			}
		}
	}

}
/* 광주시립도서관 방문을 환영합니다. 출력
 * 작업코드와 개수를 입력
 * ex) A2, B3, C0
 * (A : 대출, B : 반납, C : 종료)
 * 
 * 만약 A2를 입력했으면 책 2권 대출
 * B3는 책 3권 반납
 * 
 * 종료할때 까지 무한 반복
 * 마지막 종료 후 총 대출 권수와 반납 권수를 출력
 * */